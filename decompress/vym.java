import android.content.Context;
import android.media.AudioManager;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vym extends wp1
{
    public String operator;
    public long volume;
    
    public vym(final String s) {
        final wp1$c wp1$c = (wp1$c)asy.r0(s, (Class)wp1$c.class);
        if (wp1$c != null) {
            final long ce = wp1$c.ce;
            this.volume = (long)wp1$c.ve;
            this.operator = "=";
            final long cne = wp1$c.cne;
            long n = ce;
            if (cne > ce) {
                this.volume = (long)wp1$c.vne;
                this.operator = "!=";
                n = cne;
            }
            final long clte = wp1$c.clte;
            long n2 = n;
            if (clte > n) {
                this.volume = (long)wp1$c.vlte;
                this.operator = "<=";
                n2 = clte;
            }
            if (wp1$c.cgte > n2) {
                this.volume = (long)wp1$c.vgte;
                this.operator = ">=";
            }
        }
        else {
            this.volume = 0L;
            this.operator = ">=";
        }
    }
    
    public final String a(final String s) {
        wp1$c wp1$c;
        if ((wp1$c = (wp1$c)asy.r0(s, (Class)wp1$c.class)) == null) {
            wp1$c = new wp1$c();
        }
        final String operator = this.operator;
        Objects.requireNonNull(operator);
        int n = -1;
        switch (operator) {
            case ">=": {
                n = 5;
                break;
            }
            case "<=": {
                n = 4;
                break;
            }
            case "!=": {
                n = 3;
                break;
            }
            case ">": {
                n = 2;
                break;
            }
            case "=": {
                n = 1;
                break;
            }
            case "<": {
                n = 0;
                break;
            }
            default:
                break;
        }
        switch (n) {
            case 3: {
                final double vne = wp1$c.vne;
                final double n2 = (double)this.volume;
                final long cne = wp1$c.cne;
                wp1$c.vne = (n2 - vne) / (cne + 1L) + vne;
                wp1$c.cne = cne + 1L;
                break;
            }
            case 2:
            case 5: {
                final double vgte = wp1$c.vgte;
                final double n3 = (double)this.volume;
                final long cgte = wp1$c.cgte;
                wp1$c.vgte = (n3 - vgte) / (cgte + 1L) + vgte;
                wp1$c.cgte = cgte + 1L;
                break;
            }
            case 1: {
                final double ve = wp1$c.ve;
                final double n4 = (double)this.volume;
                final long ce = wp1$c.ce;
                wp1$c.ve = (n4 - ve) / (ce + 1L) + ve;
                wp1$c.ce = ce + 1L;
                break;
            }
            case 0:
            case 4: {
                final double vlte = wp1$c.vlte;
                final double n5 = (double)this.volume;
                final long clte = wp1$c.clte;
                wp1$c.vlte = (n5 - vlte) / (clte + 1L) + vlte;
                wp1$c.clte = clte + 1L;
                break;
            }
        }
        return asy.D0((Object)wp1$c);
    }
    
    public final boolean b(mjr operator) {
        final long volume = this.volume;
        final qu8 qu8 = (qu8)operator.C0;
        final Long ringerVolume = qu8.ringerVolume;
        final int n = 2;
        Label_0098: {
            if (ringerVolume != null) {
                break Label_0098;
            }
            final Context i = ((qlj)operator.D0).i;
            while (true) {
                try {
                    final AudioManager audioManager = (AudioManager)i.getSystemService("audio");
                    int round;
                    if (audioManager != null) {
                        round = Math.round(audioManager.getStreamVolume(2) * 100.0f / audioManager.getStreamMaxVolume(2));
                    }
                    else {
                        round = 0;
                    }
                    qu8.ringerVolume = (long)round;
                    final long longValue = ((qu8)operator.C0).ringerVolume;
                    operator = (mjr)this.operator;
                    boolean b = false;
                    Label_0408: {
                        Label_0352: {
                            if (operator != null) {
                                int n2 = 0;
                                Label_0297: {
                                    switch (((String)operator).hashCode()) {
                                        case 1983: {
                                            if (!((String)operator).equals(">=")) {
                                                break;
                                            }
                                            n2 = 5;
                                            break Label_0297;
                                        }
                                        case 1921: {
                                            if (!((String)operator).equals("<=")) {
                                                break;
                                            }
                                            n2 = 4;
                                            break Label_0297;
                                        }
                                        case 1084: {
                                            if (!((String)operator).equals("!=")) {
                                                break;
                                            }
                                            n2 = 3;
                                            break Label_0297;
                                        }
                                        case 62: {
                                            n2 = n;
                                            if (!((String)operator).equals(">")) {
                                                break;
                                            }
                                            break Label_0297;
                                        }
                                        case 61: {
                                            if (!((String)operator).equals("=")) {
                                                break;
                                            }
                                            n2 = 1;
                                            break Label_0297;
                                        }
                                        case 60: {
                                            if (!((String)operator).equals("<")) {
                                                break;
                                            }
                                            n2 = 0;
                                            break Label_0297;
                                        }
                                    }
                                    n2 = -1;
                                }
                                switch (n2) {
                                    default: {
                                        break Label_0352;
                                    }
                                    case 5: {
                                        if (longValue >= volume) {
                                            break;
                                        }
                                        break Label_0352;
                                    }
                                    case 4: {
                                        if (longValue <= volume) {
                                            break;
                                        }
                                        break Label_0352;
                                    }
                                    case 3: {
                                        if (volume != longValue) {
                                            break;
                                        }
                                        break Label_0352;
                                    }
                                    case 2: {
                                        if (longValue > volume) {
                                            break;
                                        }
                                        break Label_0352;
                                    }
                                    case 1: {
                                        if (volume == longValue) {
                                            break;
                                        }
                                        break Label_0352;
                                    }
                                    case 0: {
                                        if (longValue < volume) {
                                            break;
                                        }
                                        break Label_0352;
                                    }
                                }
                                b = true;
                                break Label_0408;
                            }
                        }
                        b = false;
                    }
                    if (!b) {
                        ck1.r(" \u2716\ufe0e Ringer Volume signal not matching");
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
    
    public final int d() {
        return 43;
    }
}
