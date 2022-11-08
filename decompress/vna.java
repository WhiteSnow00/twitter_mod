import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class vna extends FrameLayout implements View$OnClickListener
{
    public TextView C0;
    public View$OnClickListener D0;
    public a E0;
    
    public vna(final Context context, final AttributeSet set) {
        super(context, set);
        this.a(context, set);
        super.setOnClickListener((View$OnClickListener)this);
    }
    
    public abstract void a(final Context p0, final AttributeSet p1);
    
    public final void onClick(View ex) {
        final View$OnClickListener d0 = this.D0;
        if (d0 != null) {
            d0.onClick((View)ex);
        }
        final a e0 = this.E0;
        if (e0 != null) {
            final Context context = ((View)this).getContext();
            final l93$b l93$b = (l93$b)e0;
            final e3 w0 = l93$b.b.w0();
            qp2 c = null;
            String p;
            if (w0 != null) {
                p = l93$b.b.w0().p();
            }
            else {
                p = null;
            }
            Label_0272: {
                if (!pjr.e((CharSequence)p)) {
                    final Uri parse = Uri.parse(p);
                    if (p5w.w(parse) && context instanceof Activity) {
                        final i1 b1 = l93$b.a.b.b1;
                        if (b1 instanceof cbu) {
                            c = rp2.C(((cbu)b1).C0);
                        }
                        final String c2 = xd4.a().c(p, c);
                        rp2.E0((Activity)context, c2, c);
                        if (c != null) {
                            Objects.requireNonNull(d5c.Companion);
                            ddi.Companion.a().T7().e("web_view::::chrome_open", c2, c, UserIdentifier.getCurrent());
                            edi.a().k6().b.onNext((Object)new td4(1, c.t1(), c.O2(), c.e(), "", c));
                        }
                    }
                    else {
                        ex = (SecurityException)new Intent("android.intent.action.VIEW");
                        ((Intent)ex).setData(parse);
                        try {
                            context.startActivity((Intent)ex);
                            break Label_0272;
                        }
                        catch (final SecurityException ex) {}
                        catch (final ActivityNotFoundException ex2) {}
                        e9a.d((Throwable)ex);
                    }
                }
            }
            l93$b.a.e.k0((x1)new dxw(l93$b.b));
        }
    }
    
    public void setActionText(final String text) {
        this.C0.setText((CharSequence)text);
    }
    
    public void setEventListener(final a e0) {
        this.E0 = e0;
    }
    
    public void setOnClickListener(final View$OnClickListener d0) {
        this.D0 = d0;
    }
    
    public void setTextColor(final int textColor) {
        this.C0.setTextColor(textColor);
    }
    
    public interface a
    {
    }
}
