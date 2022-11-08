import com.twitter.app.dm.DMGroupParticipantsListController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qo7 implements ksc$a<p47>
{
    public final /* synthetic */ long C0;
    public final /* synthetic */ DMGroupParticipantsListController D0;
    
    public qo7(final DMGroupParticipantsListController d0, final long c0) {
        this.D0 = d0;
        this.C0 = c0;
    }
    
    public final void b(final cw0 cw0) {
        if (!((ksc)cw0).T().b) {
            final dsb a = this.D0.a;
            pf8.r(a);
            a.k(this.C0, 1);
            this.D0.h.notifyDataSetChanged();
        }
    }
}
