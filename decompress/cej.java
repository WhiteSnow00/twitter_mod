import android.view.ViewStub;
import android.view.View;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cej
{
    public final LayoutInflater a;
    public final ydj b;
    public w92 c;
    
    public cej(final LayoutInflater a, final ydj b) {
        zzd.f((Object)a, "layoutInflater");
        zzd.f((Object)b, "ocfRichTextProcessorHelper");
        this.a = a;
        this.b = b;
    }
    
    public final void a(final CharSequence charSequence, final View$OnClickListener view$OnClickListener) {
        zzd.f((Object)charSequence, "text");
        final w92 c = this.c;
        if (c != null) {
            c.s0(true);
            ((kqt)c).o0(charSequence);
            ((kqt)c).n0(view$OnClickListener);
        }
        else {
            e9a.d((Throwable)new NullPointerException("BottomToolbarCtaNavigationViewHolder is null during CTA button binding"));
        }
    }
    
    public final void b(final String s, final View$OnClickListener view$OnClickListener) {
        final w92 c = this.c;
        if (c != null) {
            c.s0(true);
            c.r0((CharSequence)s);
            c.p0(view$OnClickListener);
        }
        else {
            e9a.d((Throwable)new NullPointerException("BottomToolbarCtaNavigationViewHolder is null during Skip button binding"));
        }
    }
    
    public final void c(final TextView textView, final xdj xdj) {
        if (xdj != null) {
            this.b.a(textView, (xwm)xdj);
        }
        else {
            ((View)textView).setVisibility(8);
        }
    }
    
    public final void d(final View view, final boolean b, final int layoutResource) {
        zzd.f((Object)view, "rootView");
        final View viewById = view.findViewById(2131427879);
        zzd.e((Object)viewById, "rootView.findViewById(R.id.bottom_stub)");
        final ViewStub viewStub = (ViewStub)viewById;
        if (b) {
            viewStub.setLayoutResource(layoutResource);
        }
        viewStub.inflate();
        final w92 c = new w92(view);
        c.s0(false);
        this.c = c;
    }
}
