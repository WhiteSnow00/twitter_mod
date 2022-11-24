import com.facebook.common.file.FileUtils$CreateDirectoryException;
import java.util.Objects;
import com.facebook.common.file.FileUtils;
import java.util.Collection;
import java.io.IOException;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bp9 implements w09
{
    public final int a;
    public final zzr<File> b;
    public final String c;
    public final w73 d;
    public volatile bp9.bp9$a e;
    
    public bp9(final int a, final zzr<File> b, final String c, final w73 d) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
        this.e = new bp9.bp9$a((File)null, (w09)null);
    }
    
    @Override
    public final b C(final String s, final Object o) throws IOException {
        return this.j().C(s, o);
    }
    
    @Override
    public final long a(final String s) throws IOException {
        return this.j().a(s);
    }
    
    @Override
    public final void b() {
        try {
            this.j().b();
        }
        catch (final IOException ex) {
            final int f0 = fr0.F0;
            final eg8 h0 = eg8.H0;
            if (h0.i0(6)) {
                h0.z0(6, bp9.class.getSimpleName(), "purgeUnexpectedResources", ex);
            }
        }
    }
    
    @Override
    public final boolean c(final String s, final Object o) throws IOException {
        return this.j().c(s, o);
    }
    
    @Override
    public final long d(final a a) throws IOException {
        return this.j().d(a);
    }
    
    @Override
    public final boolean e(final String s, final Object o) throws IOException {
        return this.j().e(s, o);
    }
    
    @Override
    public final bya f(final String s, final Object o) throws IOException {
        return this.j().f(s, o);
    }
    
    @Override
    public final Collection<a> g() throws IOException {
        return this.j().g();
    }
    
    @Override
    public final void h() throws IOException {
        this.j().h();
    }
    
    public final void i() throws IOException {
        final File file = new File(this.b.get(), this.c);
        try {
            FileUtils.a(file);
            file.getAbsolutePath();
            final int f0 = fr0.F0;
            this.e = new bp9.bp9$a(file, (w09)new fh8(file, this.a, this.d));
        }
        catch (final FileUtils$CreateDirectoryException ex) {
            Objects.requireNonNull(this.d);
            throw ex;
        }
    }
    
    @Override
    public final boolean isExternal() {
        try {
            return this.j().isExternal();
        }
        catch (final IOException ex) {
            return false;
        }
    }
    
    public final w09 j() throws IOException {
        synchronized (this) {
            final bp9.bp9$a e = this.e;
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
                    v7q.m(this.e.b);
                }
                this.i();
            }
            final w09 a = this.e.a;
            Objects.requireNonNull(a);
            return a;
        }
    }
}
