import android.content.Context;
import android.telephony.TelephonyManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c0n extends rp1
{
    public boolean roaming;
    
    public c0n(final String s) {
        long long1;
        try {
            long1 = Long.parseLong(s);
        }
        catch (final Exception ex) {
            long1 = 0L;
        }
        this.roaming = (long1 >= 0L);
    }
    
    @Override
    public final String a(final String s) {
        long long1;
        try {
            long1 = Long.parseLong(s);
        }
        catch (final Exception ex) {
            long1 = 0L;
        }
        long n;
        if (this.roaming) {
            n = long1 + 1L;
        }
        else {
            n = long1 - 1L;
        }
        return String.valueOf(n);
    }
    
    @Override
    public final boolean b(final v2c v2c) {
        final boolean roaming = this.roaming;
        final au8 au8 = (au8)v2c.D0;
        Label_0093: {
            if (au8.isRoaming != null) {
                break Label_0093;
            }
            final Context i = ((vlj)v2c.E0).i;
            while (true) {
                try {
                    final TelephonyManager telephonyManager = (TelephonyManager)i.getSystemService("phone");
                    boolean b;
                    if (telephonyManager != null && telephonyManager.isNetworkRoaming() && !telephonyManager.getNetworkCountryIso().endsWith(telephonyManager.getSimCountryIso())) {
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    au8.isRoaming = b;
                    if (roaming != ((au8)v2c.D0).isRoaming) {
                        nza.x1(" \u2716\ufe0e\ufe0e Roaming signal not matching");
                        return false;
                    }
                    return true;
                }
                catch (final Exception ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    @Override
    public final int d() {
        return 44;
    }
}
