import java.util.regex.Pattern;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ojw
{
    public static final nmp<ojw> O;
    public final String A;
    public final String B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final Long I;
    public final boolean J;
    public final int K;
    public final boolean L;
    public final List<g6r> M;
    public final boolean N;
    public final long a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final String p;
    public final boolean q;
    public final String r;
    public final boolean s;
    public final boolean t;
    public final String u;
    public final String v;
    public final boolean w;
    public final String x;
    public final String y;
    public final boolean z;
    
    static {
        ojw.O = new ojw.ojw$d();
    }
    
    public ojw() {
        this(new ojw.ojw$a());
    }
    
    public ojw(final ojw.ojw$a ojw$a) {
        this.c = ojw$a.a;
        this.h = ojw$a.h;
        this.a = ojw$a.b;
        this.b = ojw$a.c;
        this.d = ojw$a.d;
        this.e = ojw$a.e;
        this.f = ojw$a.f;
        this.g = ojw$a.g;
        this.j = ojw$a.i;
        this.i = ojw$a.j;
        this.k = ojw$a.k;
        this.l = ojw$a.l;
        this.m = ojw$a.m;
        this.n = ojw$a.n;
        this.o = ojw$a.o;
        this.p = ojw$a.p;
        this.q = ojw$a.q;
        this.r = ojw$a.r;
        this.L = ojw$a.s;
        this.s = ojw$a.t;
        this.u = ojw$a.u;
        this.v = ojw$a.w;
        this.K = ojw$a.v;
        this.w = ojw$a.x;
        this.x = ojw$a.y;
        this.y = ojw$a.z;
        this.z = ojw$a.A;
        this.t = ojw$a.B;
        this.A = ojw$a.C;
        this.B = ojw$a.D;
        this.C = ojw$a.E;
        this.D = ojw$a.F;
        this.E = ojw$a.G;
        this.F = ojw$a.H;
        this.G = ojw$a.I;
        this.H = ojw$a.J;
        this.I = ojw$a.K;
        this.J = ojw$a.L;
        Object m;
        if ((m = ojw$a.M) == null) {
            m = h3a.F0;
        }
        this.M = (List<g6r>)m;
        this.N = ojw$a.N;
    }
    
    public final boolean a() {
        return "all".equals(this.u);
    }
    
    public final boolean b() {
        final String y = this.y;
        final Pattern a = flr.a;
        return e0e.a((Object)y, (Object)"enabled");
    }
    
    public final boolean c() {
        return "all_enabled".equals(this.x);
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("UserSettings{woeid=");
        f.append(this.a);
        f.append(", trendLocName='");
        go9.r(f, this.b, '\'', ", geoEnabled=");
        f.append(this.c);
        f.append(", sleepEnabled=");
        f.append(this.d);
        f.append(", sleepStartHour=");
        f.append(this.e);
        f.append(", sleepEndHour=");
        f.append(this.f);
        f.append(", language='");
        go9.r(f, this.g, '\'', ", useCookiePersonalization=");
        f.append(this.h);
        f.append(", discoverableByEmail=");
        f.append(this.i);
        f.append(", protectedUser=");
        f.append(this.j);
        f.append(", displaySensitiveMedia=");
        f.append(this.k);
        f.append(", discoverableByPhone=");
        f.append(this.n);
        f.append(", screenName='");
        go9.r(f, this.o, '\'', ", allowMediaTagging='");
        go9.r(f, this.p, '\'', ", emailFollowEnabled=");
        f.append(this.q);
        f.append(", formattedPhoneNumber='");
        go9.r(f, this.r, '\'', ", allowAdsPersonalization=");
        f.append(this.s);
        f.append(", altTextComposeEnabled=");
        f.append(this.t);
        f.append(", allowDmsFrom='");
        go9.r(f, this.u, '\'', ", countryCode='");
        go9.r(f, this.v, '\'', ", rankedTimelineSetting=");
        f.append(this.K);
        f.append(", addressbookLiveSyncEnabled=");
        f.append(this.w);
        f.append(", dmReceiptSetting='");
        go9.r(f, this.x, '\'', ", dmQualityFilter='");
        go9.r(f, this.y, '\'', ", qualityFilteringEnabled='");
        go9.r(f, this.A, '\'', ", mentionFilter='");
        go9.r(f, this.B, '\'', ", allowAuthenticatedPeriscopeRequests=");
        f.append(this.C);
        f.append(", allowLoggedOutDevicePersonalization=");
        f.append(this.D);
        f.append(", allowLocationHistoryPersonalization=");
        f.append(this.E);
        f.append(", allowThirdPartyDataSharing=");
        f.append(this.F);
        f.append(", isEuUser=");
        f.append(this.G);
        f.append(", trendsPersonalized=");
        f.append(this.L);
        f.append(", protectPasswordReset=");
        f.append(this.H);
        f.append(", nsfwUser=");
        f.append(this.l);
        f.append(", nsfwAdmin=");
        f.append(this.m);
        f.append(", mReUploadAddressBookTime=");
        f.append(this.I);
        f.append(", mSharingListeningDataWithFollowers");
        return d10.D(f, this.J, '}');
    }
    
    public static final class b
    {
        public static final b.ojw$b$a d;
        public boolean a;
        public int b;
        public int c;
        
        static {
            d = new b.ojw$b$a();
        }
        
        public b(final boolean a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class c
    {
        public static final c.ojw$c$a c;
        public long a;
        public String b;
        
        static {
            c = new c.ojw$c$a();
        }
        
        public c(final long a, final String b) {
            this.a = a;
            this.b = b;
        }
    }
}
