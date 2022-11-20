import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o0z
{
    public static final f3a b;
    public final kky a;
    
    static {
        b = new f3a("VerifySliceTaskHandler");
    }
    
    public o0z(final kky a) {
        this.a = a;
    }
    
    public final void a(final j0z j0z) {
        final File s = this.a.s((String)((duy)j0z).c, j0z.d, j0z.e, j0z.f);
        if (s.exists()) {
            try {
                final File r = this.a.r((String)((duy)j0z).c, j0z.d, j0z.e, j0z.f);
                if (r.exists()) {
                    final List<File> a = f0z.a(s, r);
                    try {
                        if (!sh4.B((List)a).equals(j0z.g)) {
                            throw new xpy(String.format("Verification failed for slice %s.", j0z.f), ((duy)j0z).b);
                        }
                        o0z.b.l("Verification of slice %s of pack %s successful.", j0z.f, ((duy)j0z).c);
                        final File t = this.a.t((String)((duy)j0z).c, j0z.d, j0z.e, j0z.f);
                        if (!t.exists()) {
                            t.mkdirs();
                        }
                        if (s.renameTo(t)) {
                            return;
                        }
                        throw new xpy(String.format("Failed to move slice %s after verification.", j0z.f), ((duy)j0z).b);
                    }
                    catch (final IOException ex) {
                        throw new xpy(String.format("Could not digest file during verification for slice %s.", j0z.f), (Exception)ex, ((duy)j0z).b);
                    }
                    catch (final NoSuchAlgorithmException ex2) {
                        throw new xpy("SHA256 algorithm not supported.", (Exception)ex2, ((duy)j0z).b);
                    }
                }
                throw new xpy(String.format("Cannot find metadata files for slice %s.", j0z.f), ((duy)j0z).b);
            }
            catch (final IOException ex3) {
                throw new xpy(String.format("Could not reconstruct slice archive during verification for slice %s.", j0z.f), (Exception)ex3, ((duy)j0z).b);
            }
        }
        throw new xpy(String.format("Cannot find unverified files for slice %s.", j0z.f), ((duy)j0z).b);
    }
}
