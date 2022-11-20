import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wn3 extends fca<in3>
{
    public static final wn3.wn3$a Companion;
    public final un3 b;
    public final d10 c;
    
    static {
        Companion = new wn3.wn3$a();
    }
    
    public wn3(final un3 b, final d10 c) {
        czd.f((Object)c, "analyticsRecorder");
        super((Class)in3.class);
        this.b = b;
        this.c = c;
    }
    
    public final void b(final UserIdentifier userIdentifier, final elm elm) {
        final in3 in3 = (in3)elm;
        czd.f((Object)userIdentifier, "userIdentifier");
        czd.f((Object)in3, "event");
        final un3 b = this.b;
        Objects.requireNonNull(b);
        final q63$a q63$a = (q63$a)((s6s)in3.b).E0;
        int n;
        if (q63$a == null) {
            n = -1;
        }
        else {
            n = un3$a.a[((Enum)q63$a).ordinal()];
        }
        final sn3 sn3 = null;
        String s;
        if (n != -1) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            s = "cnre";
                        }
                        else {
                            s = "cnoe";
                        }
                    }
                    else {
                        s = "test";
                    }
                }
                else {
                    s = "pct";
                }
            }
            else {
                s = "bce";
            }
        }
        else {
            cj1.h("CESEventData#getSetField returned null!");
            s = null;
        }
        String j;
        if (s != null) {
            j = da8.j("ces_ee_", s, "_next_sequence_number");
        }
        else {
            j = null;
        }
        sn3 sn4 = sn3;
        if (j != null) {
            sn4 = b.a.a(userIdentifier, j);
        }
        final Long value = in3.a;
        final long n2 = 0L;
        long b2;
        if (sn4 != null) {
            b2 = sn4.b;
        }
        else {
            b2 = 0L;
        }
        final Long value2 = b2;
        long a = n2;
        if (sn4 != null) {
            a = sn4.a;
        }
        final Long value3 = a;
        final q63 b3 = in3.b;
        final eba eba = new eba();
        if (value != null) {
            eba.D0 = value;
            eba.H0.set(0, true);
        }
        if (value2 != null) {
            eba.E0 = value2;
            eba.H0.set(1, true);
        }
        if (value3 != null) {
            eba.F0 = value3;
            eba.H0.set(2, true);
        }
        if (b3 != null) {
            eba.G0 = b3;
        }
        this.c.b(userIdentifier, (Object)new nn3(eba));
    }
}
