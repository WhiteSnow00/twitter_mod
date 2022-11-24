import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avx extends cj1
{
    public final Boolean m1;
    public final Boolean n1;
    public final Boolean o1;
    public final Boolean p1;
    public final Boolean q1;
    public final Boolean r1;
    
    public avx(final UserIdentifier userIdentifier, final Boolean m1, final Boolean n1, final Boolean o1, final Boolean p7, final Boolean q1, final Boolean r1) {
        super(userIdentifier);
        this.m1 = m1;
        this.n1 = n1;
        this.o1 = o1;
        this.p1 = p7;
        this.q1 = q1;
        this.r1 = r1;
    }
    
    public final trc f0() {
        final adv adv = new adv();
        adv.e = asc$b.I0;
        final int a = o5j.a;
        adv.n("/1.1/mutes/advanced_filters.json", "/");
        final Boolean m1 = this.m1;
        if (m1 != null) {
            adv.f("filter_not_following", (boolean)m1);
        }
        final Boolean n1 = this.n1;
        if (n1 != null) {
            adv.f("filter_not_followed_by", (boolean)n1);
        }
        final Boolean o1 = this.o1;
        if (o1 != null) {
            adv.f("filter_new_users", (boolean)o1);
        }
        final Boolean p1 = this.p1;
        if (p1 != null) {
            adv.f("filter_default_profile_image", (boolean)p1);
        }
        final Boolean q1 = this.q1;
        if (q1 != null) {
            adv.f("filter_no_confirmed_email", (boolean)q1);
        }
        final Boolean r1 = this.r1;
        if (r1 != null) {
            adv.f("filter_no_confirmed_phone", (boolean)r1);
        }
        return adv.k();
    }
}
