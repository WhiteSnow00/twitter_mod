import android.content.pm.Signature;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build;
import java.security.NoSuchAlgorithmException;
import android.util.Base64;
import java.security.MessageDigest;
import java.util.Arrays;
import android.os.Binder;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apy
{
    public static final v3a a;
    
    static {
        a = new v3a("PhoneskyVerificationUtils");
    }
    
    public static boolean a(final Context context) {
        final String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        return packagesForUid != null && Arrays.asList(packagesForUid).contains("com.android.vending");
    }
    
    public static boolean b(final Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                final Signature[] signatures = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatures != null) {
                    final int length = signatures.length;
                    if (length != 0) {
                        for (int i = 0; i < length; ++i) {
                            final byte[] byteArray = signatures[i].toByteArray();
                            String encodeToString;
                            try {
                                final MessageDigest instance = MessageDigest.getInstance("SHA-256");
                                instance.update(byteArray);
                                encodeToString = Base64.encodeToString(instance.digest(), 11);
                            }
                            catch (final NoSuchAlgorithmException ex) {
                                encodeToString = "";
                            }
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(encodeToString) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(encodeToString))) {
                                return true;
                            }
                        }
                        return false;
                    }
                }
                apy.a.o("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            }
            return false;
        }
        catch (final PackageManager$NameNotFoundException ex2) {
            return false;
        }
    }
}
