import java.util.List;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m1z
{
    public static final h4a b;
    public final dly a;
    
    static {
        b = new h4a("VerifySliceTaskHandler");
    }
    
    public m1z(final dly a) {
        this.a = a;
    }
    
    public final void a(final h1z h1z) {
        final File s = this.a.s((String)h1z.b, h1z.c, h1z.d, h1z.e);
        if (s.exists()) {
            try {
                final File r = this.a.r((String)h1z.b, h1z.c, h1z.d, h1z.e);
                if (r.exists()) {
                    final List a = d1z.a(s, r);
                    try {
                        if (!jb2.V0(a).equals(h1z.f)) {
                            throw new vqy(String.format("Verification failed for slice %s.", h1z.e), h1z.a);
                        }
                        m1z.b.l("Verification of slice %s of pack %s successful.", h1z.e, h1z.b);
                        final File t = this.a.t((String)h1z.b, h1z.c, h1z.d, h1z.e);
                        if (!t.exists()) {
                            t.mkdirs();
                        }
                        if (s.renameTo(t)) {
                            return;
                        }
                        throw new vqy(String.format("Failed to move slice %s after verification.", h1z.e), h1z.a);
                    }
                    catch (final IOException ex) {
                        throw new vqy(String.format("Could not digest file during verification for slice %s.", h1z.e), (Exception)ex, h1z.a);
                    }
                    catch (final NoSuchAlgorithmException ex2) {
                        throw new vqy("SHA256 algorithm not supported.", (Exception)ex2, h1z.a);
                    }
                }
                throw new vqy(String.format("Cannot find metadata files for slice %s.", h1z.e), h1z.a);
            }
            catch (final IOException ex3) {
                throw new vqy(String.format("Could not reconstruct slice archive during verification for slice %s.", h1z.e), (Exception)ex3, h1z.a);
            }
        }
        throw new vqy(String.format("Cannot find unverified files for slice %s.", h1z.e), h1z.a);
    }
}
