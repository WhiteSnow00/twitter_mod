import com.twitter.util.user.UserIdentifier;
import com.twitter.database.schema.TwitterSchema;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wam
{
    public static final a Companion;
    public final r7l a;
    public final p5l b;
    public final jhp c;
    public final Context d;
    public final tv1<noj<t4l>> e;
    
    static {
        Companion = new a();
    }
    
    public wam(final r7l a, final p5l b, final jhp c, final Context d) {
        e0e.f((Object)d, "context");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new tv1<noj<t4l>>();
    }
    
    public final t5j<noj<t4l>> a() {
        final t5j merge = t5j.merge((fbj)this.b.a(), (fbj)this.e);
        e0e.e((Object)merge, "merge(professionalReader\u2026earProfessionalDataRelay)");
        return (t5j<noj<t4l>>)merge;
    }
    
    public static final class a
    {
        public final wam a(final Context context) {
            e0e.f((Object)context, "context");
            final r7l a = r7l.Companion.a(context);
            final xmq c = ((rmq)((oxo)((sp1)kbv.d2(UserIdentifier.Companion.c())).T()).f((Class)cmw.class)).c();
            e0e.e((Object)c, "get(UserIdentifier.curre\u2026            ).getReader()");
            return new wam(a, new p5l((xmq<cmw$a>)c), new jhp(0), context);
        }
        
        public final fg4 b(final String s) {
            final fg4 fg4 = new fg4(UserIdentifier.Companion.c());
            ((o1p)fg4).T = dda.Companion.e("edit_profile", "", "", "professional_request", s).toString();
            final int a = o5j.a;
            return fg4;
        }
    }
}
