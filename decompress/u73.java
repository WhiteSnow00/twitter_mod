import java.util.Iterator;
import java.util.Set;
import java.io.DataOutputStream;
import java.util.Map;
import java.util.Arrays;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.File;
import android.util.SparseBooleanArray;
import android.util.SparseArray;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u73
{
    public final HashMap<String, t73> a;
    public final SparseArray<String> b;
    public final SparseBooleanArray c;
    public final SparseBooleanArray d;
    public b e;
    public b f;
    
    public u73(final File file, final boolean b) {
        omy.k(file != null);
        this.a = new HashMap<String, t73>();
        this.b = (SparseArray<String>)new SparseArray();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        Object e;
        if (file != null) {
            e = new u73.u73$a(new File(file, "cached_content_index.exi"), b);
        }
        else {
            e = null;
        }
        final int a = cnw.a;
        this.e = (b)e;
        this.f = null;
    }
    
    public static sf8 a(final DataInputStream dataInputStream) throws IOException {
        final int int1 = dataInputStream.readInt();
        final HashMap hashMap = new HashMap();
        for (int i = 0; i < int1; ++i) {
            final String utf = dataInputStream.readUTF();
            final int int2 = dataInputStream.readInt();
            if (int2 < 0) {
                throw new IOException(jxa.p(31, "Invalid value size: ", int2));
            }
            int n = Math.min(int2, 10485760);
            byte[] array = cnw.f;
            int n2;
            for (int j = 0; j != int2; j = n2) {
                n2 = j + n;
                array = Arrays.copyOf(array, n2);
                dataInputStream.readFully(array, j, n);
                n = Math.min(int2 - n2, 10485760);
            }
            hashMap.put(utf, array);
        }
        return new sf8((Map)hashMap);
    }
    
    public static void b(final sf8 sf8, final DataOutputStream dataOutputStream) throws IOException {
        final Set entrySet = sf8.b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (final Map.Entry<String, V> entry : entrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            final byte[] array = (Object)entry.getValue();
            dataOutputStream.writeInt(array.length);
            dataOutputStream.write(array);
        }
    }
    
    public final t73 c(final String s) {
        return this.a.get(s);
    }
    
    public final t73 d(final String s) {
        t73 t73;
        if ((t73 = this.a.get(s)) == null) {
            final SparseArray<String> b = this.b;
            final int size = b.size();
            final int n = 0;
            int n2;
            if (size == 0) {
                n2 = 0;
            }
            else {
                n2 = b.keyAt(size - 1) + 1;
            }
            int n3 = n2;
            if (n2 < 0) {
                int n4;
                for (n4 = n; n4 < size && n4 == b.keyAt(n4); ++n4) {}
                n3 = n4;
            }
            t73 = new t73(n3, s, sf8.c);
            this.a.put(s, t73);
            this.b.put(n3, (Object)s);
            this.d.put(n3, true);
            this.e.a(t73);
        }
        return t73;
    }
    
    public final void e(final long n) throws IOException {
        this.e.d(n);
        final b f = this.f;
        if (f != null) {
            f.d(n);
        }
        Label_0106: {
            if (!this.e.b()) {
                final b f2 = this.f;
                if (f2 != null && f2.b()) {
                    this.f.g(this.a, this.b);
                    this.e.e(this.a);
                    break Label_0106;
                }
            }
            this.e.g(this.a, this.b);
        }
        final b f3 = this.f;
        if (f3 != null) {
            f3.h();
            this.f = null;
        }
    }
    
    public final void f(final String s) {
        final t73 t73 = this.a.get(s);
        if (t73 != null && t73.c.isEmpty() && t73.d.isEmpty()) {
            this.a.remove(s);
            final int a = t73.a;
            final boolean value = this.d.get(a);
            this.e.f(t73, value);
            if (value) {
                this.b.remove(a);
                this.d.delete(a);
            }
            else {
                this.b.put(a, (Object)null);
                this.c.put(a, true);
            }
        }
    }
    
    public final void g() throws IOException {
        this.e.c(this.a);
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            this.b.remove(this.c.keyAt(i));
        }
        this.c.clear();
        this.d.clear();
    }
    
    public interface b
    {
        void a(final t73 p0);
        
        boolean b() throws IOException;
        
        void c(final HashMap<String, t73> p0) throws IOException;
        
        void d(final long p0);
        
        void e(final HashMap<String, t73> p0) throws IOException;
        
        void f(final t73 p0, final boolean p1);
        
        void g(final HashMap<String, t73> p0, final SparseArray<String> p1) throws IOException;
        
        void h() throws IOException;
    }
}
