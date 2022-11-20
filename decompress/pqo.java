import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqo extends d2v<qqo>
{
    public static final pqo.pqo$a Companion;
    public final UserIdentifier j1;
    
    static {
        Companion = new pqo.pqo$a();
    }
    
    public pqo(final UserIdentifier j1) {
        czd.f((Object)j1, "userIdentifier");
        super(j1, 0);
        this.j1 = j1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("safety_mode_face_pile");
        a.p("rest_id", (Object)this.j1.getStringId());
        return (tqc)((n4j)a).e();
    }
    
    public final asc<qqo, kbv> g0() {
        return (asc<qqo, kbv>)e7c.Companion.b(qqo.class, "user_result_by_rest_id", "result", "rito_suggested_actions_face_pile");
    }
    
    public final void m0(final xrc<qqo, kbv> xrc) {
    }
    
    public final void n0(final xrc<qqo, kbv> xrc) {
        final qqo qqo = (qqo)xrc.g;
    }
}
