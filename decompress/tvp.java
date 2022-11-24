import android.view.View;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.ImageView;
import android.graphics.Bitmap;
import java.util.Objects;
import com.twitter.app.posttweetactions.ui.share.ShareSheetViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tvp
{
    public final mxp a;
    public final ex8 b;
    public final h5s c;
    
    public tvp(final ShareSheetViewModel shareSheetViewModel, final mxp a, final ex8 b, final oru oru, final kcm kcm) {
        e0e.f((Object)shareSheetViewModel, "viewModel");
        e0e.f((Object)a, "viewHolder");
        e0e.f((Object)b, "dialogNavigationDelegate");
        e0e.f((Object)oru, "tweetScreenshotGeneratorFactory");
        e0e.f((Object)kcm, "releaseCompletable");
        this.a = a;
        this.b = b;
        final h5s c = (h5s)jty.N((ptb)new ptb<mru>(oru) {
            public final oru F0;
            
            public final Object invoke() {
                return oru.a(this.F0, 3);
            }
        });
        this.c = c;
        final de6 de6 = new de6();
        final mru mru = (mru)c.getValue();
        final long tweetId = shareSheetViewModel.Q0.getTweetId();
        final bxo j = iqs.j();
        e0e.e((Object)j, "mainThread()");
        Objects.requireNonNull(mru);
        final szo b2 = mru.b;
        final t5j<noj<hp6>> y2 = mru.a.y2(tweetId);
        final noj b3 = noj.b;
        final int a2 = o5j.a;
        final bbq b4 = b2.b(y2.first((Object)b3).w((rtb)new go4((stb)new kru(mru), 5)).w((rtb)new lbp((stb)new lru(mru), 12)), j);
        final svp svp = new svp((hub)new hub<Bitmap, Throwable, vzv>(this) {
            public final tvp F0;
            
            public final Object invoke(final Object o, Object o2) {
                final Bitmap imageBitmap = (Bitmap)o;
                if (o2 != null) {
                    this.F0.b.E0();
                }
                else {
                    final tvp f0 = this.F0;
                    final mxp a = f0.a;
                    final Object value = a.a.getValue();
                    e0e.e(value, "<get-tweetImage>(...)");
                    ((ImageView)value).setImageBitmap(imageBitmap);
                    final Object value2 = a.a.getValue();
                    e0e.e(value2, "<get-tweetImage>(...)");
                    ((View)value2).setVisibility(0);
                    final Object value3 = a.c.getValue();
                    e0e.e(value3, "<get-progress>(...)");
                    ((View)value3).setVisibility(8);
                    final Object value4 = a.b.getValue();
                    e0e.e(value4, "<get-skipButton>(...)");
                    ((View)value4).setOnClickListener((View$OnClickListener)new zi2((Object)f0, 8));
                    final rmv c = ita.c();
                    e0e.e((Object)c, "getCurrentMemoizing()");
                    if (c.b("android_post_tweet_actions_share_alternate_copy_enabled", false)) {
                        o2 = a.d.getValue();
                        e0e.e(o2, "<get-title>(...)");
                        ((TextView)o2).setText((CharSequence)a.a().getString(2131958040));
                        o2 = a.e.getValue();
                        e0e.e(o2, "<get-subtitle>(...)");
                        ((TextView)o2).setText((CharSequence)a.a().getString(2131958037));
                        o2 = a.e.getValue();
                        e0e.e(o2, "<get-subtitle>(...)");
                        ((View)o2).setContentDescription((CharSequence)a.a().getString(2131958038));
                    }
                }
                return vzv.a;
            }
        }, 0);
        Objects.requireNonNull(b4);
        final gw1 gw1 = new gw1((fw1)svp);
        b4.c((bdq)gw1);
        de6.a((b39)gw1);
        kcm.i((sj)new g00(de6, 4));
    }
}
