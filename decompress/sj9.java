import java.util.Objects;
import android.media.MediaDrm$MediaDrmStateException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sj9
{
    public static boolean a(final Throwable t) {
        return t instanceof MediaDrm$MediaDrmStateException;
    }
    
    public static int b(final Throwable t) {
        final String diagnosticInfo = ((MediaDrm$MediaDrmStateException)t).getDiagnosticInfo();
        final int a = rnw.a;
        int int1 = 0;
        Label_0094: {
            if (diagnosticInfo == null) {
                break Label_0094;
            }
            final String[] split = diagnosticInfo.split("_", -1);
            final int length = split.length;
            if (length < 2) {
                break Label_0094;
            }
            final String s = split[length - 1];
            boolean b;
            if (length >= 3 && "neg".equals(split[length - 2])) {
                b = true;
            }
            else {
                b = false;
            }
            try {
                Objects.requireNonNull(s);
                int1 = Integer.parseInt(s);
                if (b) {
                    int1 = -int1;
                }
                return rnw.u(int1);
            }
            catch (final NumberFormatException ex) {
                return rnw.u(int1);
            }
        }
    }
}
