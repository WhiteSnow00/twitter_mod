import java.util.Map;
import java.util.List;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "MissingPropagatedAnnotation" })
public final class ypi
{
    public static final b Companion;
    public static final ypi d;
    public static final ypi e;
    public static final List<ypi> f;
    public static final List<ypi> g;
    public static final List<ypi> h;
    public static final List<ypi> i;
    public static final List<ypi> j;
    public static final Map<String, Integer> k;
    public static final nmp<ypi> l;
    public static final nmp<List<ypi>> m;
    public final int a;
    public final String b;
    public final String c;
    
    static {
        Companion = new b();
        final ypi.ypi$a ypi$a = new ypi.ypi$a();
        ypi$a.a = 5;
        ypi$a.b = "follow";
        final ypi ypi = (ypi)((z4j)ypi$a).e();
        final ypi.ypi$a ypi$a2 = new ypi.ypi$a();
        ypi$a2.a = 1000;
        ypi$a2.b = "toggle_playback";
        d = (ypi)((z4j)ypi$a2).e();
        final ypi.ypi$a ypi$a3 = new ypi.ypi$a();
        ypi$a3.a = 1001;
        ypi$a3.b = "stop";
        e = (ypi)((z4j)ypi$a3).e();
        final ypi.ypi$a ypi$a4 = new ypi.ypi$a();
        ypi$a4.a = 9;
        ypi$a4.b = "dm_reply";
        final ypi ypi2 = (ypi)((z4j)ypi$a4).e();
        final ypi.ypi$a ypi$a5 = new ypi.ypi$a();
        ypi$a5.a = 10;
        ypi$a5.b = "dm_mute";
        final ypi ypi3 = (ypi)((z4j)ypi$a5).e();
        final ypi.ypi$a ypi$a6 = new ypi.ypi$a();
        ypi$a6.a = 1;
        ypi$a6.b = "reply";
        final ypi ypi4 = (ypi)((z4j)ypi$a6).e();
        final ypi.ypi$a ypi$a7 = new ypi.ypi$a();
        ypi$a7.a = 2;
        final ypi ypi5 = (ypi)((z4j)ypi$a7).e();
        final ypi.ypi$a ypi$a8 = new ypi.ypi$a();
        ypi$a8.a = 3;
        ypi$a8.b = "favorite";
        f = shw.y0((Object[])new ypi[] { ypi4, ypi5, (ypi)((z4j)ypi$a8).e() });
        final ypi.ypi$a ypi$a9 = new ypi.ypi$a();
        ypi$a9.a = 6;
        ypi$a9.b = "tweet_to";
        g = shw.y0((Object[])new ypi[] { ypi, (ypi)((z4j)ypi$a9).e() });
        final ypi.ypi$a ypi$a10 = new ypi.ypi$a();
        ypi$a10.a = 11;
        ypi$a10.b = "accept";
        final ypi ypi6 = (ypi)((z4j)ypi$a10).e();
        final ypi.ypi$a ypi$a11 = new ypi.ypi$a();
        ypi$a11.a = 12;
        ypi$a11.b = "deny";
        h = shw.y0((Object[])new ypi[] { ypi6, (ypi)((z4j)ypi$a11).e() });
        i = shw.y0((Object[])new ypi[] { ypi2, ypi3 });
        j = shw.x0((Object)ypi2);
        k = mlg.S(new awj[] { new awj((Object)"reply", (Object)1), new awj((Object)"retweet", (Object)2), new awj((Object)"favorite", (Object)3), new awj((Object)"follow", (Object)5), new awj((Object)"tweet_to", (Object)6), new awj((Object)"dm_reply", (Object)9), new awj((Object)"dm_mute", (Object)10), new awj((Object)"approve_follow", (Object)11), new awj((Object)"deny_follow", (Object)12), new awj((Object)"topic_follow", (Object)13), new awj((Object)"topic_not_interested", (Object)14), new awj((Object)"toggle_playback", (Object)1000), new awj((Object)"stop", (Object)1001) });
        ypi.m = new ar4$a((nmp)(ypi.l = ypi.ypi$c.c));
    }
    
    public ypi(final ypi.ypi$a ypi$a) {
        e0e.f((Object)ypi$a, "builder");
        final int a = ypi$a.a;
        final String b = ypi$a.b;
        final String c = ypi$a.c;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ypi)) {
            return false;
        }
        final ypi ypi = (ypi)o;
        return this.a == ypi.a && e0e.a((Object)this.b, (Object)ypi.b) && e0e.a((Object)this.c, (Object)ypi.c);
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
        return m51.y(awg.f("NotificationAction(type=", this.a, ", scribeAction=", this.b, ", title="), this.c, ")");
    }
    
    public static final class b
    {
    }
}
