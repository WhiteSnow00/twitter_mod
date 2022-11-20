import java.io.SequenceInputStream;
import java.util.Collection;
import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Collections;
import java.io.InputStream;
import java.util.Map;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.TreeMap;
import java.io.File;
import java.util.NavigableMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vky extends r6s
{
    public final NavigableMap<Long, File> D0;
    
    public vky(final File file, File file2) throws IOException {
        this.D0 = new TreeMap();
        final ArrayList list = (ArrayList)f0z.a(file, file2);
        if (!list.isEmpty()) {
            final Iterator iterator = list.iterator();
            long n = 0L;
            while (iterator.hasNext()) {
                file2 = (File)iterator.next();
                this.D0.put(n, file2);
                n += file2.length();
            }
            return;
        }
        throw new xpy(String.format("Virtualized slice archive empty for %s, %s", file, file2));
    }
    
    public final void close() {
    }
    
    public final long i() {
        final Map.Entry<K, File> lastEntry = this.D0.lastEntry();
        return lastEntry.getValue().length() + lastEntry.getKey();
    }
    
    public final InputStream j(final long n, final long n2) throws IOException {
        if (n < 0L || n2 < 0L) {
            throw new xpy(String.format("Invalid input parameters %s, %s", n, n2));
        }
        final long n3 = n + n2;
        if (n3 > this.i()) {
            throw new xpy(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", this.i(), n3));
        }
        final Long n4 = this.D0.floorKey(n);
        final Long n5 = this.D0.floorKey(n3);
        if (n4.equals(n5)) {
            return (InputStream)new qky(this.k(n, n4), n2);
        }
        final ArrayList list = new ArrayList();
        list.add(this.k(n, n4));
        final Collection<Object> values = this.D0.subMap(n4, false, n5, false).values();
        if (!values.isEmpty()) {
            list.add(new ovy((Enumeration)Collections.enumeration(values)));
        }
        list.add(new qky((InputStream)new FileInputStream(this.D0.get(n5)), n2 - (n5 - n)));
        return new SequenceInputStream((Enumeration<? extends InputStream>)Collections.enumeration((Collection<Object>)list));
    }
    
    public final InputStream k(final long n, final Long n2) throws IOException {
        final FileInputStream fileInputStream = new FileInputStream(this.D0.get(n2));
        if (fileInputStream.skip(n - n2) == n - n2) {
            return fileInputStream;
        }
        throw new xpy(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", n2));
    }
}
