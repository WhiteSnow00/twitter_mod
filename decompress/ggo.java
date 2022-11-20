import android.widget.TextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ggo implements ilx<pgo, bgo, ago>
{
    public static final ggo.ggo$a Companion;
    public final View D0;
    public final TypefacesTextView E0;
    public final rhh<pgo> F0;
    
    static {
        Companion = new ggo.ggo$a();
    }
    
    public ggo(final View d0) {
        czd.f((Object)d0, "rootView");
        this.D0 = d0;
        final View viewById = d0.findViewById(2131431129);
        czd.e((Object)viewById, "rootView.findViewById(R.id.room_topic_item_text)");
        final TypefacesTextView e0 = (TypefacesTextView)viewById;
        this.E0 = e0;
        this.F0 = (rhh<pgo>)q3j.g0((qsb)new qsb<rhh$a<pgo>, fzv>(this) {
            public final ggo D0;
            
            public final Object invoke(final Object o) {
                final rhh$a rhh$a = (rhh$a)o;
                czd.f((Object)rhh$a, "$this$watch");
                rhh$a.c(new foe[] { (foe)hgo.D0 }, (qsb)new igo(this.D0));
                rhh$a.c(new foe[] { (foe)jgo.D0 }, (qsb)new kgo(this.D0));
                rhh$a.c(new foe[] { (foe)lgo.D0 }, (qsb)new mgo(this.D0));
                rhh$a.c(new foe[] { (foe)ngo.D0 }, (qsb)new ogo(this.D0));
                return fzv.a;
            }
        });
        if (djo.J()) {
            final krm b = krm.Companion.b(d0);
            d0.setBackground(b.j(2131233209));
            ((TextView)e0).setTextColor(b.i(2131233211));
        }
    }
    
    public final void T(final jbx jbx) {
        final pgo pgo = (pgo)jbx;
        czd.f((Object)pgo, "state");
        this.F0.b((Object)pgo);
    }
    
    public final void q(final Object o) {
        czd.f((Object)o, "effect");
    }
    
    public final h5j<bgo> w() {
        final h5j map = max.h(this.D0).map((psb)new k2o((qsb)ggo$c.D0, 8));
        czd.e((Object)map, "rootView.clicks().map { \u2026TopicIntent.ItemClicked }");
        return (h5j<bgo>)map;
    }
}
