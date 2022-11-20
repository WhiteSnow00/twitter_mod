import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ws1 extends rp1
{
    public long maxLevel;
    public long minLevel;
    public String operator;
    
    public ws1(final String s) {
        final b b = (b)nza.H1(s, (Class)b.class);
        if (b != null) {
            this.minLevel = (long)b.minb;
            this.maxLevel = (long)b.maxb;
            this.operator = "BETWEEN";
            if (b.cnb > b.cb) {
                this.minLevel = (long)b.minnb;
                this.maxLevel = (long)b.maxnb;
                this.operator = "NOT_BETWEEN";
            }
        }
        else {
            this.minLevel = 20L;
            this.maxLevel = 100L;
            this.operator = "BETWEEN";
        }
    }
    
    @Override
    public final String a(final String s) {
        b b;
        if ((b = (b)nza.H1(s, (Class)b.class)) == null) {
            b = new b();
        }
        final String operator = this.operator;
        Objects.requireNonNull(operator);
        if (!operator.equals("NOT_BETWEEN")) {
            if (operator.equals("BETWEEN")) {
                final double minb = b.minb;
                final double n = (double)this.minLevel;
                final long cb = b.cb;
                b.minb = (n - minb) / (cb + 1L) + minb;
                final double maxb = b.maxb;
                b.maxb = (this.maxLevel - maxb) / (cb + 1L) + maxb;
                b.cb = cb + 1L;
            }
        }
        else {
            final double minnb = b.minnb;
            final double n2 = (double)this.minLevel;
            final long cnb = b.cnb;
            b.minnb = (n2 - minnb) / (cnb + 1L) + minnb;
            final double maxnb = b.maxnb;
            b.maxnb = (this.maxLevel - maxnb) / (cnb + 1L) + maxnb;
            b.cnb = cnb + 1L;
        }
        return nza.V1((Object)b);
    }
    
    @Override
    public final boolean b(v2c operator) {
        final long minLevel = this.minLevel;
        final long maxLevel = this.maxLevel;
        final au8 au8 = (au8)operator.D0;
        Label_0122: {
            if (au8.batteryLevel != null) {
                break Label_0122;
            }
            final Context i = ((vlj)operator.E0).i;
            final int n = -999;
            while (true) {
                try {
                    final Intent registerReceiver = i.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    int n2 = n;
                    if (registerReceiver != null) {
                        final int intExtra = registerReceiver.getIntExtra("scale", -1);
                        final int intExtra2 = registerReceiver.getIntExtra("level", -1);
                        if (intExtra == -1) {
                            n2 = n;
                        }
                        else {
                            n2 = intExtra2 * 100 / intExtra;
                        }
                    }
                    au8.batteryLevel = (long)n2;
                    final long longValue = ((au8)operator.D0).batteryLevel;
                    operator = (v2c)this.operator;
                    boolean b = false;
                    Label_0215: {
                        Label_0208: {
                            if (operator != null) {
                                if (!((String)operator).equals("NOT_BETWEEN")) {
                                    if (!((String)operator).equals("BETWEEN")) {
                                        break Label_0208;
                                    }
                                    if (longValue < minLevel || longValue > maxLevel) {
                                        break Label_0208;
                                    }
                                }
                                else if (longValue >= minLevel) {
                                    if (longValue <= maxLevel) {
                                        break Label_0208;
                                    }
                                }
                                b = true;
                                break Label_0215;
                            }
                        }
                        b = false;
                    }
                    if (!b) {
                        nza.x1(" \u2716\ufe0e\ufe0e\ufe0e Battery Level signal not matching");
                        return false;
                    }
                    return true;
                }
                catch (final Exception ex) {
                    final int n2 = n;
                    continue;
                }
                break;
            }
        }
    }
    
    @Override
    public final int d() {
        return 14;
    }
}
