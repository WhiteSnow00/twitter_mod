import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oo3 extends xca<ao3>
{
    public static final oo3.oo3$a Companion;
    public final mo3 b;
    public final c10 c;
    
    static {
        Companion = new oo3.oo3$a();
    }
    
    public oo3(final mo3 b, final c10 c) {
        zzd.f((Object)c, "analyticsRecorder");
        super((Class)ao3.class);
        this.b = b;
        this.c = c;
    }
    
    public final void b(final UserIdentifier userIdentifier, final okm okm) {
        final ao3 ao3 = (ao3)okm;
        zzd.f((Object)userIdentifier, "userIdentifier");
        zzd.f((Object)ao3, "event");
        final mo3 b = this.b;
        Objects.requireNonNull(b);
        final z63$a z63$a = (z63$a)((z5s)ao3.b).D0;
        int n;
        if (z63$a == null) {
            n = -1;
        }
        else {
            n = mo3.a.a[((Enum)z63$a).ordinal()];
        }
        final ko3 ko3 = null;
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
            ij1.h("CESEventData#getSetField returned null!");
            s = null;
        }
        String y;
        if (s != null) {
            y = zi.y("ces_ee_", s, "_next_sequence_number");
        }
        else {
            y = null;
        }
        ko3 ko4 = ko3;
        if (y != null) {
            ko4 = b.a.a(userIdentifier, y);
        }
        final Long value = ao3.a;
        final long n2 = 0L;
        long b2;
        if (ko4 != null) {
            b2 = ko4.b;
        }
        else {
            b2 = 0L;
        }
        final Long value2 = b2;
        long a = n2;
        if (ko4 != null) {
            a = ko4.a;
        }
        final Long value3 = a;
        final z63 b3 = ao3.b;
        final vba vba = new vba();
        if (value != null) {
            vba.C0 = value;
            vba.G0.set(0, true);
        }
        if (value2 != null) {
            vba.D0 = value2;
            vba.G0.set(1, true);
        }
        if (value3 != null) {
            vba.E0 = value3;
            vba.G0.set(2, true);
        }
        if (b3 != null) {
            vba.F0 = b3;
        }
        this.c.b(userIdentifier, new fo3(vba));
    }
}
