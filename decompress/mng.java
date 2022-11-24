import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ListAdapter;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import java.util.Locale;
import android.os.Build;
import android.view.ViewParent;
import com.google.android.material.textfield.TextInputLayout;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mng extends rj0
{
    public final ylf J0;
    public final AccessibilityManager K0;
    public final Rect L0;
    public final int M0;
    
    public mng(Context context, final AttributeSet set) {
        super(nog.a(context, set, 2130968697, 0), set, 2130968697);
        this.L0 = new Rect();
        context = ((View)this).getContext();
        final TypedArray d = uls.d(context, set, lai.a1, 2130968697, 2132019098, new int[0]);
        if (d.hasValue(0) && d.getInt(0, 0) == 0) {
            this.setKeyListener((KeyListener)null);
        }
        this.M0 = d.getResourceId(1, 2131624863);
        this.K0 = (AccessibilityManager)context.getSystemService("accessibility");
        final ylf j0 = new ylf(context, null, 2130970029, 0);
        (this.J0 = j0).q();
        j0.T0 = (View)this;
        j0.p();
        j0.setAdapter(((AutoCompleteTextView)this).getAdapter());
        j0.U0 = (AdapterView$OnItemClickListener)new lng(this);
        if (d.hasValue(2)) {
            this.setSimpleItems(d.getResourceId(2, 0));
        }
        d.recycle();
    }
    
    public static void a(final mng mng, final Object o) {
        ((AutoCompleteTextView)mng).setText(((AutoCompleteTextView)mng).convertSelectionToString(o), false);
    }
    
    public final TextInputLayout b() {
        for (ViewParent viewParent = ((View)this).getParent(); viewParent != null; viewParent = viewParent.getParent()) {
            if (viewParent instanceof TextInputLayout) {
                return (TextInputLayout)viewParent;
            }
        }
        return null;
    }
    
    public CharSequence getHint() {
        final TextInputLayout b = this.b();
        if (b != null && b.j1) {
            return b.getHint();
        }
        return super.getHint();
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final TextInputLayout b = this.b();
        if (b != null && b.j1 && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            ((TextView)this).setHint((CharSequence)"");
        }
    }
    
    public final void onMeasure(final int n, int n2) {
        super.onMeasure(n, n2);
        if (View$MeasureSpec.getMode(n) == Integer.MIN_VALUE) {
            final int measuredWidth = ((View)this).getMeasuredWidth();
            final ListAdapter adapter = ((AutoCompleteTextView)this).getAdapter();
            final TextInputLayout b = this.b();
            final int n3 = 0;
            int n4 = 0;
            n2 = n3;
            if (adapter != null) {
                if (b == null) {
                    n2 = n3;
                }
                else {
                    final int measureSpec = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredWidth(), 0);
                    final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredHeight(), 0);
                    final ylf j0 = this.J0;
                    if (!j0.isShowing()) {
                        n2 = -1;
                    }
                    else {
                        n2 = ((AdapterView)j0.H0).getSelectedItemPosition();
                    }
                    n2 = Math.max(0, n2);
                    final int min = Math.min(((Adapter)adapter).getCount(), n2 + 15);
                    int i = Math.max(0, min - 15);
                    View view = null;
                    n2 = 0;
                    while (i < min) {
                        final int itemViewType = ((Adapter)adapter).getItemViewType(i);
                        int n5;
                        if (itemViewType != (n5 = n4)) {
                            view = null;
                            n5 = itemViewType;
                        }
                        view = ((Adapter)adapter).getView(i, view, (ViewGroup)b);
                        if (view.getLayoutParams() == null) {
                            view.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
                        }
                        view.measure(measureSpec, measureSpec2);
                        n2 = Math.max(n2, view.getMeasuredWidth());
                        ++i;
                        n4 = n5;
                    }
                    final Drawable e = this.J0.e();
                    int n6 = n2;
                    if (e != null) {
                        e.getPadding(this.L0);
                        final Rect l0 = this.L0;
                        n6 = n2 + (l0.left + l0.right);
                    }
                    n2 = ((View)b.getEndIconView()).getMeasuredWidth() + n6;
                }
            }
            ((View)this).setMeasuredDimension(Math.min(Math.max(measuredWidth, n2), View$MeasureSpec.getSize(n)), ((View)this).getMeasuredHeight());
        }
    }
    
    public <T extends ListAdapter & Filterable> void setAdapter(final T adapter) {
        super.setAdapter((ListAdapter)adapter);
        this.J0.setAdapter(((AutoCompleteTextView)this).getAdapter());
    }
    
    public void setSimpleItems(final int n) {
        this.setSimpleItems(((View)this).getResources().getStringArray(n));
    }
    
    public void setSimpleItems(final String[] array) {
        this.setAdapter(new ArrayAdapter(((View)this).getContext(), this.M0, (Object[])array));
    }
    
    public final void showDropDown() {
        final AccessibilityManager k0 = this.K0;
        if (k0 != null && k0.isTouchExplorationEnabled()) {
            this.J0.show();
        }
        else {
            super.showDropDown();
        }
    }
}
