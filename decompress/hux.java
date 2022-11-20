import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hux extends zi1
{
    public final Boolean k1;
    public final Boolean l1;
    public final Boolean m1;
    public final Boolean n1;
    public final Boolean o1;
    public final Boolean p1;
    
    public hux(final UserIdentifier userIdentifier, final Boolean k1, final Boolean l1, final Boolean m1, final Boolean n1, final Boolean o1, final Boolean p7) {
        super(userIdentifier);
        this.k1 = k1;
        this.l1 = l1;
        this.m1 = m1;
        this.n1 = n1;
        this.o1 = o1;
        this.p1 = p7;
    }
    
    public final tqc f0() {
        final mcv mcv = new mcv();
        ((tqc$a)mcv).e = arc$b.G0;
        final int a = c5j.a;
        ((tqc$a)mcv).n("/1.1/mutes/advanced_filters.json", "/");
        final Boolean k1 = this.k1;
        if (k1 != null) {
            ((tqc$a)mcv).f("filter_not_following", (boolean)k1);
        }
        final Boolean l1 = this.l1;
        if (l1 != null) {
            ((tqc$a)mcv).f("filter_not_followed_by", (boolean)l1);
        }
        final Boolean m1 = this.m1;
        if (m1 != null) {
            ((tqc$a)mcv).f("filter_new_users", (boolean)m1);
        }
        final Boolean n1 = this.n1;
        if (n1 != null) {
            ((tqc$a)mcv).f("filter_default_profile_image", (boolean)n1);
        }
        final Boolean o1 = this.o1;
        if (o1 != null) {
            ((tqc$a)mcv).f("filter_no_confirmed_email", (boolean)o1);
        }
        final Boolean p1 = this.p1;
        if (p1 != null) {
            ((tqc$a)mcv).f("filter_no_confirmed_phone", (boolean)p1);
        }
        return ((tqc$a)mcv).k();
    }
}
