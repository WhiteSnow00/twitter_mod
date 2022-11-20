import androidx.work.c$a$c;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import androidx.work.c$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q4m extends ste implements qsb<i4m, c$a>
{
    public final o4m D0;
    
    public q4m(final o4m d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final i4m i4m = (i4m)o;
        czd.f((Object)i4m, "it");
        final o4m d0 = this.D0;
        Objects.requireNonNull(d0);
        final lsi$a lsi$a = new lsi$a();
        lsi$a.c = i4m.a;
        lsi$a.d = i4m.b;
        lsi$a.e = i4m.c;
        lsi$a.i = i4m.d;
        lsi$a.q(i4m.e);
        lsi$a.x = d0.c.b();
        lsi$a.a = 9;
        final UserIdentifier logged_OUT = UserIdentifier.LOGGED_OUT;
        lsi$a.p(logged_OUT);
        lsi$a.l = 91264635L;
        lsi$a.E = new j0k(Integer.valueOf(1), (Integer)null, (Integer)null);
        final int length = i4m.g.length();
        final int n = 0;
        if (length > 0) {
            final rpi$a rpi$a = new rpi$a();
            final esi$a esi$a = new esi$a();
            esi$a.a = i4m.g;
            rpi$a.a = (esi)((n4j)esi$a).e();
            final esi$a esi$a2 = new esi$a();
            esi$a2.a = i4m.g;
            rpi$a.c = (esi)((n4j)esi$a2).e();
            lsi$a.F = (ksi)((n4j)rpi$a).e();
        }
        else {
            final rpi$a rpi$a2 = new rpi$a();
            final esi$a esi$a3 = new esi$a();
            String f = i4m.f;
            int n2 = n;
            if (f.length() == 0) {
                n2 = 1;
            }
            if (n2 != 0) {
                f = "https://pbs.twimg.com/profile_images/1488548719062654976/u6qfBBkF_200x200.jpg";
            }
            esi$a3.a = f;
            esi$a3.c = true;
            rpi$a2.a = (esi)((n4j)esi$a3).e();
            lsi$a.F = (ksi)((n4j)rpi$a2).e();
        }
        d0.b.e((lsi)((n4j)lsi$a).e(), rvi.a());
        this.D0.a.a();
        this.D0.a.b();
        this.D0.f.b(logged_OUT, (elm)new af4(new String[] { "notification::status_bar:client_initiated_mr_logged_out:success" }));
        return new c$a$c();
    }
}
