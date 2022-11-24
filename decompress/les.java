import android.os.Build$VERSION;
import android.telephony.TelephonyManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class les
{
    public static String a(final Context context) {
        while (true) {
            try {
                int n = 0;
                Label_0049: {
                    if (qo6.a(context, "android.permission.READ_PHONE_STATE") == 0) {
                        final TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
                        if (telephonyManager != null) {
                            if (Build$VERSION.SDK_INT >= 24) {
                                n = telephonyManager.getDataNetworkType();
                                break Label_0049;
                            }
                            n = telephonyManager.getNetworkType();
                            break Label_0049;
                        }
                    }
                    n = 0;
                }
                switch (n) {
                    default: {
                        return "0";
                    }
                    case 20: {
                        return "5G";
                    }
                    case 16: {
                        return "1G";
                    }
                    case 13:
                    case 18: {
                        return "4G";
                    }
                    case 8:
                    case 9:
                    case 10:
                    case 14:
                    case 15: {
                        return "3.5G";
                    }
                    case 4:
                    case 7:
                    case 11: {
                        return "2G";
                    }
                    case 3:
                    case 17: {
                        return "3G";
                    }
                    case 1:
                    case 2:
                    case 5:
                    case 6:
                    case 12: {
                        return "2.5G";
                    }
                }
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
}
