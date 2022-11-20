import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Iterator;
import java.io.OutputStream;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hth extends yb
{
    public final zhl F0;
    public final ArrayList<b> G0;
    public int H0;
    
    public hth() {
        this.G0 = new ArrayList<b>();
        this.F0 = null;
        super.D0 = (bhc)new ur1("multipart/form-data; boundary=twitter");
        super.E0 = true;
    }
    
    @Override
    public final long a() {
        return this.H0;
    }
    
    @Override
    public final void c(final OutputStream outputStream) throws IOException {
        final uy6 uy6 = new uy6(outputStream, (long)this.H0, this.F0);
        final Iterator<b> iterator = this.G0.iterator();
        while (iterator.hasNext()) {
            iterator.next().c((OutputStream)uy6);
        }
    }
    
    public final void f(final String s, final String s2, final twm twm, final long n, final lm6 lm6) throws IOException {
        final StringBuilder q = tqf.q("--twitter", "\r\n", "Content-Disposition: form-data; name=\"", s, "\"; filename=\"");
        zip.c(q, s2, "\"", "\r\n");
        if (lm6 != null) {
            q.append("Content-Type: ");
            q.append(lm6);
            q.append("\r\n");
        }
        q.append("Content-Transfer-Encoding: binary");
        q.append("\r\n");
        q.append("\r\n");
        final byte[] bytes = q.toString().getBytes("UTF-8");
        final byte[] bytes2 = "\r\n".getBytes("UTF-8");
        final ArrayList<b> g0 = this.G0;
        g0.add((b)new a(bytes));
        g0.add((b)new c(twm));
        g0.add((b)new a(bytes2));
        this.H0 += (int)(n + bytes.length + bytes2.length);
    }
    
    public final void g() throws IOException {
        final byte[] bytes = "--twitter--\r\n".getBytes("UTF-8");
        final a a = new a(bytes);
        this.H0 += bytes.length;
        this.G0.add((b)a);
    }
    
    @Override
    public final InputStream o() {
        return (InputStream)new ith((ArrayList)this.G0);
    }
    
    public static final class a implements b
    {
        public final byte[] a;
        
        public a(final byte[] a) {
            this.a = a;
        }
        
        @Override
        public final InputStream b() {
            return new ByteArrayInputStream(this.a);
        }
        
        @Override
        public final void c(final OutputStream outputStream) throws IOException {
            outputStream.write(this.a);
        }
    }
    
    public interface b
    {
        InputStream b() throws IOException;
        
        void c(final OutputStream p0) throws IOException;
    }
    
    public static final class c implements b
    {
        public final twm a;
        
        public c(final twm a) {
            this.a = a;
        }
        
        @Override
        public final InputStream b() throws IOException {
            this.a.G();
            return (InputStream)this.a;
        }
        
        @Override
        public final void c(final OutputStream outputStream) throws IOException {
            this.a.G();
            h1e.i((InputStream)this.a, outputStream);
            this.a.G();
        }
    }
}
