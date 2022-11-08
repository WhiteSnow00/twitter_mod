import android.view.Window;
import java.util.Iterator;
import android.view.ViewParent;
import android.view.LayoutInflater;
import android.content.DialogInterface$OnDismissListener;
import java.util.Collection;
import java.util.ArrayList;
import android.widget.TextView;
import android.animation.TimeInterpolator;
import android.widget.ImageButton;
import android.view.View$OnClickListener;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.content.Context;
import android.view.View;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vvq extends Dialog
{
    public static final a Companion;
    public final mbi<?> C0;
    public final gjo D0;
    public Integer E0;
    public final View F0;
    
    static {
        Companion = new a();
    }
    
    public vvq(final Context context, final WindowManager windowManager, final mbi<?> c0, final gjo d0) {
        zzd.f((Object)context, "context");
        zzd.f((Object)windowManager, "windowManager");
        zzd.f((Object)c0, "navigator");
        zzd.f((Object)d0, "roomsScribeReporter");
        super(context, 2132018360);
        this.C0 = c0;
        this.D0 = d0;
        final LayoutInflater layoutInflater = this.getLayoutInflater();
        final Integer n = null;
        final View inflate = layoutInflater.inflate(2131625698, (ViewGroup)null, false);
        zzd.e((Object)inflate, "layoutInflater.inflate(s\u2026come_layout, null, false)");
        this.setContentView(this.F0 = inflate);
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        final ConstraintLayout constraintLayout = (ConstraintLayout)inflate;
        constraintLayout.setMinHeight(displayMetrics.heightPixels);
        final ViewParent parent = ((View)constraintLayout).getParent();
        zzd.d((Object)parent, "null cannot be cast to non-null type android.view.View");
        ((View)parent).setBackgroundColor(this.getContext().getResources().getColor(2131100784));
        inflate.setOnClickListener((View$OnClickListener)new yrf((Object)this, 26));
        final ImageButton imageButton = (ImageButton)this.findViewById(2131431641);
        if (imageButton != null) {
            ((View)imageButton).setOnClickListener((View$OnClickListener)new n39((Object)this, 7));
        }
        final ImageButton imageButton2 = (ImageButton)this.findViewById(2131431644);
        if (imageButton2 != null) {
            ((View)imageButton2).setOnClickListener((View$OnClickListener)new qi2((Object)this, 29));
        }
        final View viewById = inflate.findViewById(2131429747);
        viewById.setAlpha(0.0f);
        viewById.animate().setInterpolator((TimeInterpolator)new aq9()).setStartDelay(600L).setDuration(400L).alpha(1.0f).start();
        final TextView textView = (TextView)this.findViewById(2131431645);
        final TextView textView2 = (TextView)this.findViewById(2131431643);
        final ArrayList list = new ArrayList();
        jt0.C0((Object[])new TextView[] { textView, textView2 }, (Collection)list);
        for (final TextView textView3 : list) {
            ((View)textView3).setAlpha(0.0f);
            ((View)textView3).setTranslationY(-(float)this.getContext().getResources().getDimensionPixelSize(2131167434));
            ((View)textView3).animate().setInterpolator((TimeInterpolator)new aq9()).setStartDelay(600L).setDuration(400L).translationY(0.0f).alpha(1.0f).start();
        }
        this.a(context.getResources().getColor(2131100784));
        final Window window = this.getWindow();
        Integer value = n;
        if (window != null) {
            value = window.getStatusBarColor();
        }
        this.E0 = value;
        this.setOnDismissListener((DialogInterface$OnDismissListener)new uvq((Object)this, 0));
        gjo.T(this.D0, "tab", "prompt", "", "impression", null, null, null, null, 496);
    }
    
    public final void a(final Integer n) {
        final Window window = this.getWindow();
        if (window != null) {
            window.clearFlags(67108864);
        }
        final Window window2 = this.getWindow();
        if (window2 != null) {
            window2.addFlags(Integer.MIN_VALUE);
        }
        if (n != null) {
            final Window window3 = this.getWindow();
            if (window3 != null) {
                window3.setStatusBarColor((int)n);
            }
        }
    }
    
    public static final class a
    {
    }
}
