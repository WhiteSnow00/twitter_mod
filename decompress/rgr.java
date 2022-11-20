import com.twitter.android.media.imageeditor.stickers.StickerSelectorView;
import java.util.Objects;
import java.util.List;
import com.twitter.android.media.stickers.a;
import com.twitter.android.media.imageeditor.c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rgr implements orc$a<zgr>
{
    public final trc D0;
    public final qgr E0;
    
    public rgr(final qgr e0, final trc d0) {
        this.E0 = e0;
        this.D0 = d0;
    }
    
    public final void a(final wv0 wv0) {
    }
    
    public final void b(final wv0 wv0) {
        final sgr j1 = ((zgr)wv0).j1;
        if (j1 != null) {
            final qgr e0 = this.E0;
            final qgr$c g = e0.g;
            final List b = qgr.b(j1, e0.d).b;
            final StickerSelectorView g2 = ((c)((b5w)g).D0).g;
            final m4s a = hq1.a;
            g2.setStickerFeaturedCategoryData((List)com.twitter.android.media.stickers.a.a(b, System.currentTimeMillis()));
            final xv0 d = this.D0.d();
            final qgr e2 = this.E0;
            final lux lux = new lux(e2.a, e2.e, j1);
            Objects.requireNonNull(d);
            d.d(new wv0((zv0<S>)lux));
        }
    }
    
    public final void c(final wv0 wv0, final boolean b) {
    }
}
