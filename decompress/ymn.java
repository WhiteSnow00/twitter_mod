import android.view.ViewParent;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import android.widget.Button;
import tv.periscope.android.view.WaitingTextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ymn
{
    public final ImageView a;
    public final TypefacesTextView b;
    public final WaitingTextView c;
    public final Button d;
    public final ImageView e;
    public final ImageView f;
    public final ImageView g;
    public int h;
    
    public ymn(View viewById) {
        e0e.f((Object)viewById, "rootView");
        final View viewById2 = viewById.findViewById(2131429412);
        e0e.e((Object)viewById2, "rootView.findViewById(R.id.header_ic_chevron)");
        this.a = (ImageView)viewById2;
        final View viewById3 = viewById.findViewById(2131429430);
        e0e.e((Object)viewById3, "rootView.findViewById(R.id.header_text_title)");
        this.b = (TypefacesTextView)viewById3;
        final View viewById4 = viewById.findViewById(2131429431);
        e0e.e((Object)viewById4, "rootView.findViewById(R.\u2026header_text_waiting_view)");
        this.c = (WaitingTextView)viewById4;
        final View viewById5 = viewById.findViewById(2131429426);
        e0e.e((Object)viewById5, "rootView.findViewById(R.id.header_text_end)");
        this.d = (Button)viewById5;
        final View viewById6 = viewById.findViewById(2131429402);
        e0e.e((Object)viewById6, "rootView.findViewById(R.id.header_action_share)");
        this.e = (ImageView)viewById6;
        final View viewById7 = viewById.findViewById(2131429401);
        e0e.e((Object)viewById7, "rootView.findViewById(R.id.header_action_more)");
        this.f = (ImageView)viewById7;
        viewById = viewById.findViewById(2131429413);
        e0e.e((Object)viewById, "rootView.findViewById(R.id.header_ic_end)");
        this.g = (ImageView)viewById;
        this.h = 2;
    }
    
    public final void a(final View view) {
        final ViewParent parent = ((View)this.f).getParent();
        ConstraintLayout constraintLayout;
        if (parent instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout)parent;
        }
        else {
            constraintLayout = null;
        }
        if (constraintLayout == null) {
            return;
        }
        final b b = new b();
        b.g(constraintLayout);
        b.i(((View)this.f).getId(), 7, view.getId(), 6);
        b.b(constraintLayout);
    }
}
