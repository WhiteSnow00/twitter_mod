import java.util.Objects;
import java.util.logging.Level;
import java.util.NoSuchElementException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.io.IOException;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.logging.Logger;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xsl implements Closeable
{
    public static final Logger I0;
    public final RandomAccessFile C0;
    public int D0;
    public int E0;
    public a F0;
    public a G0;
    public final byte[] H0;
    
    static {
        I0 = Logger.getLogger(xsl.class.getName());
    }
    
    public xsl(final File file) throws IOException {
        this.H0 = new byte[16];
        if (!file.exists()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            sb.append(".tmp");
            final File file2 = new File(sb.toString());
            final RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                final byte[] array = new byte[16];
                int i = 0;
                int n = 0;
                while (i < 4) {
                    z(array, n, (new int[] { 4096, 0, 0, 0 })[i]);
                    n += 4;
                    ++i;
                }
                randomAccessFile.write(array);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            }
            finally {
                randomAccessFile.close();
            }
        }
        final RandomAccessFile c0 = new RandomAccessFile(file, "rwd");
        (this.C0 = c0).seek(0L);
        c0.readFully(this.H0);
        final int h = h(this.H0, 0);
        this.D0 = h;
        if (h <= c0.length()) {
            this.E0 = h(this.H0, 4);
            final int h2 = h(this.H0, 8);
            final int h3 = h(this.H0, 12);
            this.F0 = this.f(h2);
            this.G0 = this.f(h3);
            return;
        }
        final StringBuilder g = w48.g("File is truncated. Expected length: ");
        g.append(this.D0);
        g.append(", Actual length: ");
        g.append(c0.length());
        throw new IOException(g.toString());
    }
    
    public static int h(final byte[] array, final int n) {
        return ((array[n] & 0xFF) << 24) + ((array[n + 1] & 0xFF) << 16) + ((array[n + 2] & 0xFF) << 8) + (array[n + 3] & 0xFF);
    }
    
    public static void z(final byte[] array, final int n, final int n2) {
        array[n] = (byte)(n2 >> 24);
        array[n + 1] = (byte)(n2 >> 16);
        array[n + 2] = (byte)(n2 >> 8);
        array[n + 3] = (byte)n2;
    }
    
    public final void a(final byte[] array) throws IOException {
        final int length = array.length;
        monitorenter(this);
        Label_0172: {
            if ((length | 0x0) < 0) {
                break Label_0172;
            }
            try {
                if (length <= array.length - 0) {
                    this.c(length);
                    final boolean e = this.e();
                    int p;
                    if (e) {
                        p = 16;
                    }
                    else {
                        final a g0 = this.G0;
                        p = this.p(g0.a + 4 + g0.b);
                    }
                    final a a = new a(p, length);
                    z(this.H0, 0, length);
                    this.k(p, this.H0, 4);
                    this.k(p + 4, array, length);
                    int a2;
                    if (e) {
                        a2 = p;
                    }
                    else {
                        a2 = this.F0.a;
                    }
                    this.q(this.D0, this.E0 + 1, a2, p);
                    this.G0 = a;
                    ++this.E0;
                    if (e) {
                        this.F0 = a;
                    }
                    return;
                }
                throw new IndexOutOfBoundsException();
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public final void b() throws IOException {
        synchronized (this) {
            this.q(4096, 0, 0, 0);
            this.E0 = 0;
            final a c = a.c;
            this.F0 = c;
            this.G0 = c;
            if (this.D0 > 4096) {
                this.C0.setLength(4096);
                this.C0.getChannel().force(true);
            }
            this.D0 = 4096;
        }
    }
    
    public final void c(int n) throws IOException {
        final int n2 = n + 4;
        int n3 = this.D0 - this.m();
        if (n3 >= n2) {
            return;
        }
        n = this.D0;
        int i;
        int d0;
        do {
            i = n3 + n;
            d0 = n << 1;
            n3 = i;
            n = d0;
        } while (i < n2);
        this.C0.setLength(d0);
        this.C0.getChannel().force(true);
        final a g0 = this.G0;
        n = this.p(g0.a + 4 + g0.b);
        if (n < this.F0.a) {
            final FileChannel channel = this.C0.getChannel();
            channel.position(this.D0);
            final long n4 = n - 4;
            if (channel.transferTo(16L, n4, channel) != n4) {
                throw new AssertionError((Object)"Copied insufficient number of bytes!");
            }
        }
        final int a = this.G0.a;
        n = this.F0.a;
        if (a < n) {
            final int n5 = this.D0 + a - 16;
            this.q(d0, this.E0, n, n5);
            this.G0 = new a(n5, this.G0.b);
        }
        else {
            this.q(d0, this.E0, n, a);
        }
        this.D0 = d0;
    }
    
    @Override
    public final void close() throws IOException {
        synchronized (this) {
            this.C0.close();
        }
    }
    
    public final void d(final c c) throws IOException {
        synchronized (this) {
            int n = this.F0.a;
            for (int i = 0; i < this.E0; ++i) {
                final a f = this.f(n);
                ((ysl)c).a(new b(f), f.b);
                n = this.p(f.a + 4 + f.b);
            }
        }
    }
    
    public final boolean e() {
        synchronized (this) {
            return this.E0 == 0;
        }
    }
    
    public final a f(final int n) throws IOException {
        if (n == 0) {
            return a.c;
        }
        this.C0.seek(n);
        return new a(n, this.C0.readInt());
    }
    
    public final void i() throws IOException {
        synchronized (this) {
            if (!this.e()) {
                if (this.E0 == 1) {
                    this.b();
                }
                else {
                    final a f0 = this.F0;
                    final int p = this.p(f0.a + 4 + f0.b);
                    this.j(p, this.H0, 0, 4);
                    final int h = h(this.H0, 0);
                    this.q(this.D0, this.E0 - 1, p, this.G0.a);
                    --this.E0;
                    this.F0 = new a(p, h);
                }
                return;
            }
            throw new NoSuchElementException();
        }
    }
    
    public final void j(int p4, final byte[] array, final int n, final int n2) throws IOException {
        p4 = this.p(p4);
        final int d0 = this.D0;
        if (p4 + n2 <= d0) {
            this.C0.seek(p4);
            this.C0.readFully(array, n, n2);
        }
        else {
            final int n3 = d0 - p4;
            this.C0.seek(p4);
            this.C0.readFully(array, n, n3);
            this.C0.seek(16L);
            this.C0.readFully(array, n + n3, n2 - n3);
        }
    }
    
    public final void k(int p3, final byte[] array, final int n) throws IOException {
        p3 = this.p(p3);
        final int d0 = this.D0;
        if (p3 + n <= d0) {
            this.C0.seek(p3);
            this.C0.write(array, 0, n);
        }
        else {
            final int n2 = d0 - p3;
            this.C0.seek(p3);
            this.C0.write(array, 0, n2);
            this.C0.seek(16L);
            this.C0.write(array, n2 + 0, n - n2);
        }
    }
    
    public final int m() {
        if (this.E0 == 0) {
            return 16;
        }
        final a g0 = this.G0;
        final int a = g0.a;
        final int a2 = this.F0.a;
        if (a >= a2) {
            return a - a2 + 4 + g0.b + 16;
        }
        return a + 4 + g0.b + this.D0 - a2;
    }
    
    public final int p(int n) {
        final int d0 = this.D0;
        if (n >= d0) {
            n = n + 16 - d0;
        }
        return n;
    }
    
    public final void q(final int n, final int n2, final int n3, final int n4) throws IOException {
        final byte[] h0 = this.H0;
        int i = 0;
        int n5 = 0;
        while (i < 4) {
            z(h0, n5, (new int[] { n, n2, n3, n4 })[i]);
            n5 += 4;
            ++i;
        }
        this.C0.seek(0L);
        this.C0.write(this.H0);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(xsl.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.D0);
        sb.append(", size=");
        sb.append(this.E0);
        sb.append(", first=");
        sb.append(this.F0);
        sb.append(", last=");
        sb.append(this.G0);
        sb.append(", element lengths=[");
        try {
            synchronized (this) {
                int n = this.F0.a;
                int n2 = 1;
                for (int i = 0; i < this.E0; ++i) {
                    final a f = this.f(n);
                    new b(f);
                    final int b = f.b;
                    if (n2 != 0) {
                        n2 = 0;
                    }
                    else {
                        sb.append(", ");
                    }
                    sb.append(b);
                    n = this.p(f.a + 4 + f.b);
                }
            }
        }
        catch (final IOException ex) {
            xsl.I0.log(Level.WARNING, "read error", ex);
        }
        sb.append("]]");
        return sb.toString();
    }
    
    public static final class a
    {
        public static final a c;
        public final int a;
        public final int b;
        
        static {
            c = new a(0, 0);
        }
        
        public a(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(a.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.a);
            sb.append(", length = ");
            return gd.y(sb, this.b, "]");
        }
    }
    
    public final class b extends InputStream
    {
        public int C0;
        public int D0;
        
        public b(final a a) {
            this.C0 = xsl.this.p(a.a + 4);
            this.D0 = a.b;
        }
        
        @Override
        public final int read() throws IOException {
            if (this.D0 == 0) {
                return -1;
            }
            xsl.this.C0.seek(this.C0);
            final int read = xsl.this.C0.read();
            this.C0 = xsl.this.p(this.C0 + 1);
            --this.D0;
            return read;
        }
        
        @Override
        public final int read(final byte[] array, final int n, final int n2) throws IOException {
            Objects.requireNonNull(array, "buffer");
            if ((n | n2) < 0 || n2 > array.length - n) {
                throw new ArrayIndexOutOfBoundsException();
            }
            final int d0 = this.D0;
            if (d0 > 0) {
                int n3;
                if ((n3 = n2) > d0) {
                    n3 = d0;
                }
                xsl.this.j(this.C0, array, n, n3);
                this.C0 = xsl.this.p(this.C0 + n3);
                this.D0 -= n3;
                return n3;
            }
            return -1;
        }
    }
    
    public interface c
    {
    }
}
