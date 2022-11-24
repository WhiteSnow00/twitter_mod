import android.os.Build$VERSION;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r7k
{
    public static final String h;
    public static final Map<Integer, String> i;
    public final typ a;
    public final Context b;
    public final u7k c;
    public final xk0 d;
    public final jg4 e;
    public final zqi f;
    public final pev g;
    
    static {
        h = Long.toString(n2v.a);
        final kkg t = kkg.t();
        t.w((Object)0, (Object)"unknown");
        t.w((Object)1, (Object)"granted");
        t.w((Object)2, (Object)"denied_allow_retry");
        t.w((Object)3, (Object)"blocked");
        i = (Map)((z4j)t).e();
    }
    
    public r7k(final Context b, final u7k c, final xk0 d, final jg4 e, final zqi f, final pev g) {
        this.a = new typ();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final t6s a(final t7k t7k) {
        final int ordinal = ((Enum)t7k).ordinal();
        final boolean b = true;
        int n = 0;
        final int n2 = 0;
        Label_0204: {
            switch (ordinal) {
                default: {
                    break Label_0204;
                }
                case 6: {
                    final nq a = pp.a();
                    int n3 = n2;
                    if (a != null) {
                        n3 = n2;
                        if (a.b) {
                            n3 = 1;
                        }
                    }
                    n = (n3 ^ 0x1);
                    break Label_0204;
                }
                case 5: {
                    if (Build$VERSION.SDK_INT < 33) {
                        n = (this.b("android.permission.READ_EXTERNAL_STORAGE") ? 1 : 0);
                        break Label_0204;
                    }
                    n = (b ? 1 : 0);
                    if (this.b("android.permission.READ_MEDIA_IMAGES")) {
                        break Label_0204;
                    }
                    if (this.b("android.permission.READ_MEDIA_VIDEO")) {
                        n = (b ? 1 : 0);
                        break Label_0204;
                    }
                    break;
                }
                case 4: {
                    n = (this.b("android.permission.RECORD_AUDIO") ? 1 : 0);
                    break Label_0204;
                }
                case 3: {
                    n = (this.b("android.permission.CAMERA") ? 1 : 0);
                    break Label_0204;
                }
                case 2: {
                    n = (this.g.l() ? 1 : 0);
                    break Label_0204;
                }
                case 1: {
                    n = (b ? 1 : 0);
                    if (this.b("android.permission.ACCESS_FINE_LOCATION")) {
                        break Label_0204;
                    }
                    if (this.b("android.permission.ACCESS_COARSE_LOCATION")) {
                        n = (b ? 1 : 0);
                        break Label_0204;
                    }
                    break;
                }
                case 0: {
                    n = (this.b("android.permission.READ_CONTACTS") ? 1 : 0);
                    break Label_0204;
                }
            }
            n = 0;
        }
        t6s t6s;
        if (n != 0) {
            t6s = t6s.F0;
        }
        else {
            t6s = t6s.G0;
        }
        return t6s;
    }
    
    public final boolean b(final String s) {
        return this.c.a(this.b, new String[] { s });
    }
}
