import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.HashMap;
import java.nio.channels.FileChannel;
import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lw6
{
    public static final Map<String, Lock> e;
    public final File a;
    public final Lock b;
    public final boolean c;
    public FileChannel d;
    
    static {
        lw6.e = new HashMap();
    }
    
    public lw6(final String s, final File file, final boolean c) {
        final File a = new File(file, mqb.l(s, ".lck"));
        this.a = a;
        final String absolutePath = a.getAbsolutePath();
        final HashMap e = lw6.e;
        synchronized (e) {
            Lock b;
            if ((b = e.get(absolutePath)) == null) {
                b = new ReentrantLock();
                e.put(absolutePath, b);
            }
            monitorexit(e);
            this.b = b;
            this.c = c;
        }
    }
    
    public final void a() {
        final FileChannel d = this.d;
        while (true) {
            if (d == null) {
                break Label_0013;
            }
            try {
                d.close();
                this.b.unlock();
            }
            catch (final IOException ex) {
                continue;
            }
            break;
        }
    }
}
