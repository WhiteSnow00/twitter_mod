import android.content.res.Resources;
import java.util.Iterator;
import java.util.List;
import android.view.View;
import android.view.View$OnClickListener;
import com.twitter.ui.socialproof.SocialProofView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xqb
{
    public final SocialProofView a;
    
    public xqb(final SocialProofView a, final View$OnClickListener view$OnClickListener) {
        this.a = a;
        this.a(view$OnClickListener);
    }
    
    public final void a(final View$OnClickListener onClickListener) {
        if (this.a.getSocialProofContainerView() != null) {
            final View socialProofContainerView = this.a.getSocialProofContainerView();
            socialProofContainerView.setEnabled(onClickListener != null);
            socialProofContainerView.setOnClickListener(onClickListener);
        }
    }
    
    public final void b(final List<cgv> list, final Integer n) {
        final SocialProofView a = this.a;
        if (list.isEmpty()) {
            this.a(null);
        }
        final rif h = rif.H();
        final rif h2 = rif.H();
        int n2;
        if (n != null) {
            n2 = n;
        }
        else {
            n2 = list.size();
        }
        n2 -= 3;
        for (final cgv cgv : list.subList(0, Math.min(list.size(), 3))) {
            h2.p((Object)cgv.E0);
            if (!ikr.e((CharSequence)cgv.c()) && !cgv.c().equalsIgnoreCase(cgv.K0)) {
                h.p((Object)cgv.c());
            }
            else {
                h.p((Object)ikr.l(cgv.K0));
            }
        }
        final List list2 = (List)((n4j)h).e();
        final rif h3 = rif.H();
        h3.q((Iterable)list2);
        String quantityString;
        if (n2 > 0) {
            quantityString = ((View)this.a).getResources().getQuantityString(2131820628, n2, new Object[] { n2 });
            h3.p((Object)quantityString);
        }
        else {
            quantityString = "";
        }
        final List list3 = (List)((n4j)h3).e();
        final Resources resources = ((View)this.a).getResources();
        final int size = list3.size();
        String s;
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    if (size != 3) {
                        s = resources.getString(2131955980, new Object[] { list3.get(0), list3.get(1), list3.get(2), quantityString });
                    }
                    else {
                        s = resources.getString(2131955981, new Object[] { list3.get(0), list3.get(1), list3.get(2) });
                    }
                }
                else {
                    s = resources.getString(2131955982, new Object[] { list3.get(0), list3.get(1) });
                }
            }
            else {
                s = resources.getString(2131955979, new Object[] { list3.get(0) });
            }
        }
        else {
            s = resources.getString(2131955983);
        }
        final kjq socialProofData = new kjq();
        socialProofData.a = s;
        socialProofData.e = (List)((n4j)h2).e();
        socialProofData.b = s;
        a.setSocialProofData(socialProofData);
    }
}
