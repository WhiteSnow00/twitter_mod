import java.util.Map;
import java.util.List;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "MissingPropagatedAnnotation" })
public final class hpi
{
    public static final b Companion;
    public static final hpi d;
    public static final hpi e;
    public static final List<hpi> f;
    public static final List<hpi> g;
    public static final List<hpi> h;
    public static final List<hpi> i;
    public static final List<hpi> j;
    public static final Map<String, Integer> k;
    public static final rlp<hpi> l;
    public static final rlp<List<hpi>> m;
    public final int a;
    public final String b;
    public final String c;
    
    static {
        Companion = new b();
        final a a = new a();
        a.a = 5;
        a.b = "follow";
        final hpi hpi = (hpi)a.e();
        final a a2 = new a();
        a2.a = 1000;
        a2.b = "toggle_playback";
        d = (hpi)a2.e();
        final a a3 = new a();
        a3.a = 1001;
        a3.b = "stop";
        e = (hpi)a3.e();
        final a a4 = new a();
        a4.a = 9;
        a4.b = "dm_reply";
        final hpi hpi2 = (hpi)a4.e();
        final a a5 = new a();
        a5.a = 10;
        a5.b = "dm_mute";
        final hpi hpi3 = (hpi)a5.e();
        final a a6 = new a();
        a6.a = 1;
        a6.b = "reply";
        final hpi hpi4 = (hpi)a6.e();
        final a a7 = new a();
        a7.a = 2;
        final hpi hpi5 = (hpi)a7.e();
        final a a8 = new a();
        a8.a = 3;
        a8.b = "favorite";
        f = s9i.s(hpi4, hpi5, (hpi)a8.e());
        final a a9 = new a();
        a9.a = 6;
        a9.b = "tweet_to";
        g = s9i.s(hpi, (hpi)a9.e());
        final a a10 = new a();
        a10.a = 11;
        a10.b = "accept";
        final hpi hpi6 = (hpi)a10.e();
        final a a11 = new a();
        a11.a = 12;
        a11.b = "deny";
        h = s9i.s(hpi6, (hpi)a11.e());
        i = s9i.s(hpi2, hpi3);
        j = s9i.r(hpi2);
        k = tkg.n0(new lvj[] { new lvj((Object)"reply", (Object)1), new lvj((Object)"retweet", (Object)2), new lvj((Object)"favorite", (Object)3), new lvj((Object)"follow", (Object)5), new lvj((Object)"tweet_to", (Object)6), new lvj((Object)"dm_reply", (Object)9), new lvj((Object)"dm_mute", (Object)10), new lvj((Object)"approve_follow", (Object)11), new lvj((Object)"deny_follow", (Object)12), new lvj((Object)"topic_follow", (Object)13), new lvj((Object)"topic_not_interested", (Object)14), new lvj((Object)"toggle_playback", (Object)1000), new lvj((Object)"stop", (Object)1001) });
        hpi.m = new vp4$a((rlp)(hpi.l = hpi.hpi$c.c));
    }
    
    public hpi(final a a) {
        czd.f((Object)a, "builder");
        final int a2 = a.a;
        final String b = a.b;
        final String c = a.c;
        this.a = a2;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hpi)) {
            return false;
        }
        final hpi hpi = (hpi)o;
        return this.a == hpi.a && czd.a((Object)this.b, (Object)hpi.b) && czd.a((Object)this.c, (Object)hpi.c);
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final String b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final String c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (a * 31 + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return ed.B(fu8.k("NotificationAction(type=", this.a, ", scribeAction=", this.b, ", title="), this.c, ")");
    }
    
    public static final class a extends n4j<hpi>
    {
        public int a;
        public String b;
        public String c;
        
        public final Object i() {
            return new hpi(this);
        }
    }
    
    public static final class b
    {
    }
}
