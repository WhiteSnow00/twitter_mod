import java.util.Objects;
import com.twitter.app.posttweetactions.ui.share.ShareSheetViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gup
{
    public final zvp a;
    public final nw8 b;
    public final u3s c;
    
    public gup(final ShareSheetViewModel shareSheetViewModel, final zvp a, final nw8 b, final iqu iqu, final ibm ibm) {
        zzd.f((Object)shareSheetViewModel, "viewModel");
        zzd.f((Object)a, "viewHolder");
        zzd.f((Object)b, "dialogNavigationDelegate");
        zzd.f((Object)iqu, "tweetScreenshotGeneratorFactory");
        zzd.f((Object)ibm, "releaseCompletable");
        this.a = a;
        this.b = b;
        final u3s c = (u3s)rp2.z0((otb)new gup$b(iqu));
        this.c = c;
        final rd6 rd6 = new rd6();
        final gqu gqu = (gqu)c.getValue();
        final long tweetId = shareSheetViewModel.N0.getTweetId();
        final qvo l = h6q.L();
        zzd.e((Object)l, "mainThread()");
        Objects.requireNonNull(gqu);
        final iyo b2 = gqu.b;
        final b5j y2 = gqu.a.y2(tweetId);
        final snj b3 = snj.b;
        final int a2 = w4j.a;
        final n9q b4 = b2.b(y2.first((Object)b3).w((qtb)new do4((rtb)new equ(gqu), 5)).w((qtb)new qcb((rtb)new fqu(gqu), 2)), l);
        final a9v a9v = new a9v((gub)new gup$a(this), 1);
        Objects.requireNonNull(b4);
        final dw1 dw1 = new dw1((cw1)a9v);
        b4.c((nbq)dw1);
        rd6.a((j29)dw1);
        ibm.i((rj)new xqw(rd6, 1));
    }
}
