import java.io.IOException;
import java.util.Objects;
import java.util.zip.ZipInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdi
{
    public final adi a;
    public final wli b;
    
    public jdi(final adi a, final wli b) {
        this.a = a;
        this.b = b;
    }
    
    public final oeg<udg> a(String a, final InputStream inputStream, final String s, final String s2) throws IOException {
        String s3 = s;
        if (s == null) {
            s3 = "application/json";
        }
        gya gya;
        oeg<udg> oeg;
        if (!s3.contains("application/zip") && !a.split("\\?")[0].endsWith(".lottie")) {
            kag.a();
            gya = gya.G0;
            if (s2 == null) {
                oeg = wdg.c(inputStream, null);
            }
            else {
                oeg = wdg.c(new FileInputStream(new File(this.a.c(a, inputStream, gya).getAbsolutePath())), a);
            }
        }
        else {
            kag.a();
            gya = gya.H0;
            if (s2 == null) {
                oeg = wdg.f(new ZipInputStream(inputStream), null);
            }
            else {
                oeg = wdg.f(new ZipInputStream(new FileInputStream(this.a.c(a, inputStream, gya))), a);
            }
        }
        if (s2 != null && oeg.a != null) {
            final adi a2 = this.a;
            Objects.requireNonNull(a2);
            a = adi.a(a, gya, true);
            final File file = new File(a2.b(), a);
            final File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            final boolean renameTo = file.renameTo(file2);
            file2.toString();
            kag.a();
            if (!renameTo) {
                final StringBuilder f = ehk.f("Unable to rename cache file ");
                f.append(file.getAbsolutePath());
                f.append(" to ");
                f.append(file2.getAbsolutePath());
                f.append(".");
                kag.b(f.toString());
            }
        }
        return oeg;
    }
}
