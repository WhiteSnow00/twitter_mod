import java.util.List;
import com.google.android.filament.utils.Float3;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ang
{
    public static boolean a(final int n) {
        if (n == 1) {
            return true;
        }
        if (n == 2) {
            return true;
        }
        if (n == 3) {
            return false;
        }
        throw null;
    }
    
    public static float b(final Float3 float3, final float n, final float n2) {
        return float3.getY() * n + n2;
    }
    
    public static String c(final StringBuilder sb, final long n, final String s) {
        sb.append(n);
        sb.append(s);
        return sb.toString();
    }
    
    public static void d(final tx6 tx6, final smp smp, final List list) {
        ((k5j)new ar4$a((nmp)tx6)).c(smp, (Object)list);
    }
    
    public static String e(final int n) {
        if (n == 1) {
            return "NAVIGATE_TO_LATEST_ISSUE";
        }
        if (n == 2) {
            return "NAVIGATE_TO_NEWSLETTER";
        }
        if (n == 3) {
            return "UPDATE_STATE";
        }
        return "null";
    }
    
    public static String f(final int n) {
        if (n == 1) {
            return "ASSET";
        }
        if (n == 2) {
            return "PROFILE";
        }
        return "null";
    }
}
