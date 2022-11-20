// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl
{
    public int a;
    public int b;
    public int c;
    public int d;
    
    public AudioAttributesImplBase() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof AudioAttributesImplBase;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase)o;
        boolean b3 = b2;
        if (this.b == audioAttributesImplBase.b) {
            final int c = this.c;
            final int c2 = audioAttributesImplBase.c;
            final int d = audioAttributesImplBase.d;
            int n = 4;
            if (d != -1) {
                n = d;
            }
            else {
                final int a = audioAttributesImplBase.a;
                final int b4 = AudioAttributesCompat.b;
                if ((c2 & 0x1) == 0x1) {
                    n = 7;
                }
                else if ((c2 & 0x4) == 0x4) {
                    n = 6;
                }
                else {
                    switch (a) {
                        default: {
                            n = 3;
                            break;
                        }
                        case 4: {
                            break;
                        }
                        case 13: {
                            n = 1;
                            break;
                        }
                        case 11: {
                            n = 10;
                            break;
                        }
                        case 6: {
                            n = 2;
                            break;
                        }
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10: {
                            n = 5;
                            break;
                        }
                        case 3: {
                            n = 8;
                            break;
                        }
                        case 2: {
                            n = 0;
                            break;
                        }
                    }
                }
            }
            int n2;
            if (n == 6) {
                n2 = (c2 | 0x4);
            }
            else {
                n2 = c2;
                if (n == 7) {
                    n2 = (c2 | 0x1);
                }
            }
            b3 = b2;
            if (c == (n2 & 0x111)) {
                b3 = b2;
                if (this.a == audioAttributesImplBase.a) {
                    b3 = b2;
                    if (this.d == d) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.c, this.a, this.d });
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        final int a = this.a;
        final int b = AudioAttributesCompat.b;
        String z = null;
        switch (a) {
            default: {
                z = udu.z("unknown usage ", a);
                break;
            }
            case 16: {
                z = "USAGE_ASSISTANT";
                break;
            }
            case 14: {
                z = "USAGE_GAME";
                break;
            }
            case 13: {
                z = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            }
            case 12: {
                z = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            }
            case 11: {
                z = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            }
            case 10: {
                z = "USAGE_NOTIFICATION_EVENT";
                break;
            }
            case 9: {
                z = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            }
            case 8: {
                z = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            }
            case 7: {
                z = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            }
            case 6: {
                z = "USAGE_NOTIFICATION_RINGTONE";
                break;
            }
            case 5: {
                z = "USAGE_NOTIFICATION";
                break;
            }
            case 4: {
                z = "USAGE_ALARM";
                break;
            }
            case 3: {
                z = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            }
            case 2: {
                z = "USAGE_VOICE_COMMUNICATION";
                break;
            }
            case 1: {
                z = "USAGE_MEDIA";
                break;
            }
            case 0: {
                z = "USAGE_UNKNOWN";
                break;
            }
        }
        sb.append(z);
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }
}
