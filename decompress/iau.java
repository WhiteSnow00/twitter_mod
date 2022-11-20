import android.content.Context;
import java.util.Map;
import java.util.List;
import androidx.fragment.app.p;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iau extends kp1
{
    public final Activity c;
    
    public iau(final p p2, final Activity c) {
        czd.f((Object)c, "activityContext");
        super(p2, c);
        this.c = c;
    }
    
    public final gz6 b() {
        final gz6$a gz6$a = new gz6$a(2131232212);
        gz6$a.c = 2;
        return (gz6)((n4j)gz6$a).e();
    }
    
    public final oxm<sfs> c(final bo6 bo6) {
        czd.f((Object)bo6, "tweet");
        final String j1 = bo6.D0.j1;
        String s;
        if (j1 != null && j1.length() != 0) {
            s = ((Context)this.c).getString(2131957178, new Object[] { bo6.D0.j1 });
        }
        else {
            s = ((Context)this.c).getString(2131957179);
        }
        czd.e((Object)s, "if (!tweet.canonicalTwee\u2026ends_description_default)");
        final oxm b = nym.b(new String[] { ((Context)this.c).getString(2131957181) }, s);
        final oxm.b b2 = new oxm.b<Object>();
        b2.a = b.D0;
        final int a = c5j.a;
        b2.b = b.E0;
        b2.c = 0;
        return (oxm<sfs>)((n4j)b2).e();
    }
    
    public final int d() {
        return -1651894572;
    }
    
    public final String e() {
        return "TRUSTED_FRIENDS_EDUCATION_FRAGMENT_TAG";
    }
    
    public final rov f() {
        return new rov("", (rov$a)new rov$b(oxm.H0), (List)f2a.D0, (h0p)null, 6, spv.E0);
    }
    
    public final oxm<sfs> g() {
        return (oxm<sfs>)new oxm(((Context)this.c).getString(2131957180), (Map)k2a.D0, 0);
    }
}
