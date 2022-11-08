import com.facebook.common.file.FileUtils$CreateDirectoryException;
import java.util.Objects;
import com.facebook.common.file.FileUtils;
import java.util.Collection;
import java.io.IOException;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class po9 implements e09
{
    public final int a;
    public final lyr<File> b;
    public final String c;
    public final n73 d;
    public volatile a e;
    
    public po9(final int a, final lyr<File> b, final String c, final n73 d) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
        this.e = new a(null, null);
    }
    
    public final e09$b C(final String s, final Object o) throws IOException {
        return this.j().C(s, o);
    }
    
    public final long a(final String s) throws IOException {
        return this.j().a(s);
    }
    
    public final void b() {
        try {
            this.j().b();
        }
        catch (final IOException ex) {
            final int d0 = dli.D0;
            final rp2 e0 = rp2.E0;
            if (e0.u0(6)) {
                e0.H0(6, po9.class.getSimpleName(), "purgeUnexpectedResources", (Throwable)ex);
            }
        }
    }
    
    public final boolean c(final String s, final Object o) throws IOException {
        return this.j().c(s, o);
    }
    
    public final long d(final e09$a e09$a) throws IOException {
        return this.j().d(e09$a);
    }
    
    public final boolean e(final String s, final Object o) throws IOException {
        return this.j().e(s, o);
    }
    
    public final bya f(final String s, final Object o) throws IOException {
        return this.j().f(s, o);
    }
    
    public final Collection<e09$a> g() throws IOException {
        return this.j().g();
    }
    
    public final void h() throws IOException {
        this.j().h();
    }
    
    public final void i() throws IOException {
        final File file = new File((File)this.b.get(), this.c);
        try {
            FileUtils.a(file);
            file.getAbsolutePath();
            final int d0 = dli.D0;
            this.e = new a(file, (e09)new qg8(file, this.a, this.d));
        }
        catch (final FileUtils$CreateDirectoryException ex) {
            Objects.requireNonNull(this.d);
            throw ex;
        }
    }
    
    public final boolean isExternal() {
        try {
            return this.j().isExternal();
        }
        catch (final IOException ex) {
            return false;
        }
    }
    
    public final e09 j() throws IOException {
        synchronized (this) {
            final a e = this.e;
            boolean b2 = false;
            Label_0040: {
                if (e.a != null) {
                    final File b = e.b;
                    if (b != null) {
                        if (b.exists()) {
                            b2 = false;
                            break Label_0040;
                        }
                    }
                }
                b2 = true;
            }
            if (b2) {
                if (this.e.a != null && this.e.b != null) {
                    j78.n(this.e.b);
                }
                this.i();
            }
            final e09 a = this.e.a;
            Objects.requireNonNull(a);
            return a;
        }
    }
    
    public static final class a
    {
        public final e09 a;
        public final File b;
        
        public a(final File b, final e09 a) {
            this.a = a;
            this.b = b;
        }
    }
}
