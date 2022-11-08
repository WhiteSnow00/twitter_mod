import com.twitter.app.dm.DMConversationContentViewProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ak7 extends mfk<l49>
{
    public final /* synthetic */ DMConversationContentViewProvider D0;
    
    public ak7(final DMConversationContentViewProvider d0) {
        this.D0 = d0;
    }
    
    public final void b(final ifk ifk) {
        final l49 l49 = (l49)ifk;
        final DMConversationContentViewProvider d0 = this.D0;
        final cda a3 = DMConversationContentViewProvider.A3;
        if (((wl1)d0.D0).Q1) {
            cag.a("LivePipeline", "Fetching new messages...");
            this.D0.S1.a();
            final DMConversationContentViewProvider.DMConversationContentViewProvider$f k2 = this.D0.k2;
            if (k2 != null) {
                k2.m.incrementAndGet();
            }
        }
    }
}
