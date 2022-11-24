import android.view.View;
import android.view.MenuItem;
import com.twitter.ui.navigation.BadgeableTabView;
import android.view.View$OnClickListener;
import android.content.Context;
import android.view.LayoutInflater;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class moc extends lo1<Boolean>
{
    public final zai G0;
    public final noc H0;
    
    public moc(final noc h0, final zai g0) {
        this.H0 = h0;
        this.G0 = g0;
    }
    
    public final void onNext(Object o) {
        final Boolean b = (Boolean)o;
        final noc h0 = this.H0;
        final zai g0 = this.G0;
        final boolean booleanValue = b;
        Objects.requireNonNull(h0);
        final MenuItem item = g0.findItem(2131432129);
        if (item != null) {
            String s;
            if (booleanValue) {
                s = ((Context)h0.a).getString(2131958650);
            }
            else {
                s = ((Context)h0.a).getString(2131958651);
            }
            item.setVisible(h0.g.b());
            p5h.a(item, (CharSequence)s);
        }
        final MenuItem item2 = g0.findItem(2131432119);
        if (item2 != null && xli.C()) {
            if (item2.getActionView() == null) {
                final vit h2 = h0.h;
                Objects.requireNonNull(h2);
                final ysj a = h2.b.a(pgg.P0);
                if (a != null) {
                    final View inflate = LayoutInflater.from((Context)h2.a).inflate(2131624091, g0.d().getView(), false);
                    inflate.setOnClickListener((View$OnClickListener)new mpa((Object)g0, (Object)item2, 6));
                    final BadgeableTabView badgeableTabView = (BadgeableTabView)inflate.findViewById(2131427773);
                    if (badgeableTabView != null) {
                        badgeableTabView.setIconResource(a.h);
                        CharSequence description;
                        if ((description = a.k) == null) {
                            description = a.c;
                        }
                        badgeableTabView.setDescription(description);
                        badgeableTabView.setBadgeMode(2);
                        o = new yg1((oh1)badgeableTabView);
                        h2.c.b((oz6)o);
                    }
                    item2.setActionView(inflate);
                }
            }
            item2.setVisible(true);
        }
    }
}
