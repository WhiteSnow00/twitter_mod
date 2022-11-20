// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.widget.AbsListView;
import android.view.AbsSavedState;
import android.widget.AbsSpinner;
import android.widget.PopupWindow$OnDismissListener;
import java.util.WeakHashMap;
import java.util.Objects;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;
import android.database.DataSetObserver;
import android.os.Build$VERSION;
import android.content.res.Resources$Theme;
import android.widget.ThemedSpinnerAdapter;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import android.widget.ListAdapter;
import android.widget.Adapter;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.os.Parcelable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.widget.ArrayAdapter;
import android.util.Log;
import android.view.View;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.widget.SpinnerAdapter;
import android.content.Context;
import android.annotation.SuppressLint;
import android.widget.Spinner;

public class AppCompatSpinner extends Spinner
{
    @SuppressLint({ "ResourceType" })
    public static final int[] L0;
    public final sj0 D0;
    public final Context E0;
    public a F0;
    public SpinnerAdapter G0;
    public final boolean H0;
    public h I0;
    public int J0;
    public final Rect K0;
    
    static {
        L0 = new int[] { 16843505 };
    }
    
    public AppCompatSpinner(final Context context, final AttributeSet set) {
        this(context, set, 2130970675);
    }
    
    public AppCompatSpinner(final Context e0, AttributeSet set, final int n) {
        super(e0, set, n);
        this.K0 = new Rect();
        hms.a((View)this, ((View)this).getContext());
        final TypedArray obtainStyledAttributes = e0.obtainStyledAttributes(set, jee.d1, n, 0);
        this.D0 = new sj0((View)this);
        int n2 = obtainStyledAttributes.getResourceId(4, 0);
        if (n2 != 0) {
            this.E0 = (Context)new tn6(e0, n2);
        }
        else {
            this.E0 = e0;
        }
        AttributeSet obtainStyledAttributes2 = null;
        final int n3 = -1;
        Label_0422: {
            Label_0205: {
                TypedArray typedArray2 = null;
                Label_0200: {
                    TypedArray typedArray;
                    try {
                        typedArray = (TypedArray)(obtainStyledAttributes2 = (AttributeSet)e0.obtainStyledAttributes(set, AppCompatSpinner.L0, n, 0));
                        n2 = n3;
                        typedArray2 = typedArray;
                        try {
                            try {
                                if (!typedArray.hasValue(0)) {
                                    break Label_0200;
                                }
                                obtainStyledAttributes2 = (AttributeSet)typedArray;
                                n2 = typedArray.getInt(0, 0);
                            }
                            finally {}
                        }
                        catch (final Exception typedArray2) {}
                    }
                    catch (final Exception typedArray2) {
                        typedArray = null;
                    }
                    finally {
                        set = obtainStyledAttributes2;
                        break Label_0422;
                    }
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", (Throwable)typedArray2);
                    n2 = n3;
                    if (typedArray == null) {
                        break Label_0205;
                    }
                    typedArray2 = typedArray;
                    n2 = n3;
                }
                typedArray2.recycle();
            }
            if (n2 != 0) {
                if (n2 == 1) {
                    final g i0 = new g(this.E0, set, n);
                    final kat q = kat.q(this.E0, set, jee.d1, n);
                    this.J0 = q.k(3, -2);
                    i0.b1.setBackgroundDrawable(q.g(1));
                    i0.f1 = obtainStyledAttributes.getString(2);
                    q.r();
                    this.I0 = (h)i0;
                    this.F0 = new a(this, (View)this, i0);
                }
            }
            else {
                final AppCompatSpinner.AppCompatSpinner$e i2 = new AppCompatSpinner.AppCompatSpinner$e(this);
                this.I0 = (h)i2;
                i2.F0 = obtainStyledAttributes.getString(2);
            }
            final CharSequence[] textArray = obtainStyledAttributes.getTextArray(0);
            if (textArray != null) {
                final ArrayAdapter adapter = new ArrayAdapter(e0, 17367048, (Object[])textArray);
                adapter.setDropDownViewResource(2131625751);
                this.setAdapter((SpinnerAdapter)adapter);
            }
            obtainStyledAttributes.recycle();
            this.H0 = true;
            final SpinnerAdapter g0 = this.G0;
            if (g0 != null) {
                this.setAdapter(g0);
                this.G0 = null;
            }
            this.D0.d(set, n);
            return;
        }
        if (set != null) {
            ((TypedArray)set).recycle();
        }
    }
    
    public final int a(final SpinnerAdapter spinnerAdapter, final Drawable drawable) {
        int n = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredWidth(), 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredHeight(), 0);
        final int max = Math.max(0, ((AdapterView)this).getSelectedItemPosition());
        final int min = Math.min(((Adapter)spinnerAdapter).getCount(), max + 15);
        int i = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int max2 = 0;
        while (i < min) {
            final int itemViewType = ((Adapter)spinnerAdapter).getItemViewType(i);
            int n2;
            if (itemViewType != (n2 = n)) {
                view = null;
                n2 = itemViewType;
            }
            view = ((Adapter)spinnerAdapter).getView(i, view, (ViewGroup)this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
            }
            view.measure(measureSpec, measureSpec2);
            max2 = Math.max(max2, view.getMeasuredWidth());
            ++i;
            n = n2;
        }
        int n3 = max2;
        if (drawable != null) {
            drawable.getPadding(this.K0);
            final Rect k0 = this.K0;
            n3 = max2 + (k0.left + k0.right);
        }
        return n3;
    }
    
    public final void b() {
        this.I0.i(c.b((View)this), c.a((View)this));
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final sj0 d0 = this.D0;
        if (d0 != null) {
            d0.a();
        }
    }
    
    public int getDropDownHorizontalOffset() {
        final h i0 = this.I0;
        if (i0 != null) {
            return i0.a();
        }
        return super.getDropDownHorizontalOffset();
    }
    
    public int getDropDownVerticalOffset() {
        final h i0 = this.I0;
        if (i0 != null) {
            return i0.j();
        }
        return super.getDropDownVerticalOffset();
    }
    
    public int getDropDownWidth() {
        if (this.I0 != null) {
            return this.J0;
        }
        return super.getDropDownWidth();
    }
    
    public final h getInternalPopup() {
        return this.I0;
    }
    
    public Drawable getPopupBackground() {
        final h i0 = this.I0;
        if (i0 != null) {
            return i0.e();
        }
        return super.getPopupBackground();
    }
    
    public Context getPopupContext() {
        return this.E0;
    }
    
    public CharSequence getPrompt() {
        final h i0 = this.I0;
        CharSequence charSequence;
        if (i0 != null) {
            charSequence = i0.d();
        }
        else {
            charSequence = super.getPrompt();
        }
        return charSequence;
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final sj0 d0 = this.D0;
        ColorStateList b;
        if (d0 != null) {
            b = d0.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final sj0 d0 = this.D0;
        PorterDuff$Mode c;
        if (d0 != null) {
            c = d0.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final h i0 = this.I0;
        if (i0 != null && i0.isShowing()) {
            this.I0.dismiss();
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (this.I0 != null && View$MeasureSpec.getMode(n) == Integer.MIN_VALUE) {
            ((View)this).setMeasuredDimension(Math.min(Math.max(((View)this).getMeasuredWidth(), this.a(((AbsSpinner)this).getAdapter(), ((View)this).getBackground())), View$MeasureSpec.getSize(n)), ((View)this).getMeasuredHeight());
        }
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        final SavedState savedState = (SavedState)parcelable;
        super.onRestoreInstanceState(((AbsSavedState)savedState).getSuperState());
        if (savedState.mShowDropdown) {
            final ViewTreeObserver viewTreeObserver = ((View)this).getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener(this) {
                    public final AppCompatSpinner D0;
                    
                    public final void onGlobalLayout() {
                        if (!this.D0.getInternalPopup().isShowing()) {
                            this.D0.b();
                        }
                        final ViewTreeObserver viewTreeObserver = ((View)this.D0).getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            b.a(viewTreeObserver, (ViewTreeObserver$OnGlobalLayoutListener)this);
                        }
                    }
                });
            }
        }
    }
    
    public final Parcelable onSaveInstanceState() {
        final SavedState savedState = new SavedState(super.onSaveInstanceState());
        final h i0 = this.I0;
        savedState.mShowDropdown = (i0 != null && i0.isShowing());
        return (Parcelable)savedState;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final a f0 = this.F0;
        return (f0 != null && ((vlb)f0).onTouch((View)this, motionEvent)) || super.onTouchEvent(motionEvent);
    }
    
    public final boolean performClick() {
        final h i0 = this.I0;
        if (i0 != null) {
            if (!i0.isShowing()) {
                this.b();
            }
            return true;
        }
        return super.performClick();
    }
    
    public /* bridge */ void setAdapter(final Adapter adapter) {
        this.setAdapter((SpinnerAdapter)adapter);
    }
    
    public void setAdapter(final SpinnerAdapter spinnerAdapter) {
        if (!this.H0) {
            this.G0 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.I0 != null) {
            Context context;
            if ((context = this.E0) == null) {
                context = ((View)this).getContext();
            }
            this.I0.setAdapter((ListAdapter)new f(spinnerAdapter, context.getTheme()));
        }
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final sj0 d0 = this.D0;
        if (d0 != null) {
            d0.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final sj0 d0 = this.D0;
        if (d0 != null) {
            d0.f(backgroundResource);
        }
    }
    
    public void setDropDownHorizontalOffset(final int dropDownHorizontalOffset) {
        final h i0 = this.I0;
        if (i0 != null) {
            i0.h(dropDownHorizontalOffset);
            this.I0.c(dropDownHorizontalOffset);
        }
        else {
            super.setDropDownHorizontalOffset(dropDownHorizontalOffset);
        }
    }
    
    public void setDropDownVerticalOffset(final int dropDownVerticalOffset) {
        final h i0 = this.I0;
        if (i0 != null) {
            i0.g(dropDownVerticalOffset);
        }
        else {
            super.setDropDownVerticalOffset(dropDownVerticalOffset);
        }
    }
    
    public void setDropDownWidth(final int n) {
        if (this.I0 != null) {
            this.J0 = n;
        }
        else {
            super.setDropDownWidth(n);
        }
    }
    
    public void setPopupBackgroundDrawable(final Drawable popupBackgroundDrawable) {
        final h i0 = this.I0;
        if (i0 != null) {
            i0.m(popupBackgroundDrawable);
        }
        else {
            super.setPopupBackgroundDrawable(popupBackgroundDrawable);
        }
    }
    
    public void setPopupBackgroundResource(final int n) {
        this.setPopupBackgroundDrawable(v68.x(this.getPopupContext(), n));
    }
    
    public void setPrompt(final CharSequence prompt) {
        final h i0 = this.I0;
        if (i0 != null) {
            i0.f(prompt);
        }
        else {
            super.setPrompt(prompt);
        }
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final sj0 d0 = this.D0;
        if (d0 != null) {
            d0.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final sj0 d0 = this.D0;
        if (d0 != null) {
            d0.i(porterDuff$Mode);
        }
    }
    
    public static class SavedState extends View$BaseSavedState
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        public boolean mShowDropdown;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<SavedState>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new SavedState(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new SavedState[n];
                }
            };
        }
        
        public SavedState(final Parcel parcel) {
            super(parcel);
            this.mShowDropdown = (parcel.readByte() != 0);
        }
        
        public SavedState(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeByte((byte)(byte)(this.mShowDropdown ? 1 : 0));
        }
    }
    
    public static final class b
    {
        public static void a(final ViewTreeObserver viewTreeObserver, final ViewTreeObserver$OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener);
        }
    }
    
    public static final class c
    {
        public static int a(final View view) {
            return view.getTextAlignment();
        }
        
        public static int b(final View view) {
            return view.getTextDirection();
        }
        
        public static void c(final View view, final int textAlignment) {
            view.setTextAlignment(textAlignment);
        }
        
        public static void d(final View view, final int textDirection) {
            view.setTextDirection(textDirection);
        }
    }
    
    public static final class d
    {
        public static void a(final ThemedSpinnerAdapter themedSpinnerAdapter, final Resources$Theme dropDownViewTheme) {
            if (themedSpinnerAdapter.getDropDownViewTheme() != dropDownViewTheme) {
                themedSpinnerAdapter.setDropDownViewTheme(dropDownViewTheme);
            }
        }
    }
    
    public static final class f implements ListAdapter, SpinnerAdapter
    {
        public SpinnerAdapter D0;
        public ListAdapter E0;
        
        public f(final SpinnerAdapter d0, final Resources$Theme resources$Theme) {
            this.D0 = d0;
            if (d0 instanceof ListAdapter) {
                this.E0 = (ListAdapter)d0;
            }
            if (resources$Theme != null) {
                if (Build$VERSION.SDK_INT >= 23 && d0 instanceof ThemedSpinnerAdapter) {
                    d.a((ThemedSpinnerAdapter)d0, resources$Theme);
                }
                else if (d0 instanceof kms) {
                    final kms kms = (kms)d0;
                    if (kms.getDropDownViewTheme() == null) {
                        kms.b();
                    }
                }
            }
        }
        
        public final boolean areAllItemsEnabled() {
            final ListAdapter e0 = this.E0;
            return e0 == null || e0.areAllItemsEnabled();
        }
        
        public final int getCount() {
            final SpinnerAdapter d0 = this.D0;
            int count;
            if (d0 == null) {
                count = 0;
            }
            else {
                count = ((Adapter)d0).getCount();
            }
            return count;
        }
        
        public final View getDropDownView(final int n, View dropDownView, final ViewGroup viewGroup) {
            final SpinnerAdapter d0 = this.D0;
            if (d0 == null) {
                dropDownView = null;
            }
            else {
                dropDownView = d0.getDropDownView(n, dropDownView, viewGroup);
            }
            return dropDownView;
        }
        
        public final Object getItem(final int n) {
            final SpinnerAdapter d0 = this.D0;
            Object item;
            if (d0 == null) {
                item = null;
            }
            else {
                item = ((Adapter)d0).getItem(n);
            }
            return item;
        }
        
        public final long getItemId(final int n) {
            final SpinnerAdapter d0 = this.D0;
            long itemId;
            if (d0 == null) {
                itemId = -1L;
            }
            else {
                itemId = ((Adapter)d0).getItemId(n);
            }
            return itemId;
        }
        
        public final int getItemViewType(final int n) {
            return 0;
        }
        
        public final View getView(final int n, final View view, final ViewGroup viewGroup) {
            return this.getDropDownView(n, view, viewGroup);
        }
        
        public final int getViewTypeCount() {
            return 1;
        }
        
        public final boolean hasStableIds() {
            final SpinnerAdapter d0 = this.D0;
            return d0 != null && ((Adapter)d0).hasStableIds();
        }
        
        public final boolean isEmpty() {
            return this.getCount() == 0;
        }
        
        public final boolean isEnabled(final int n) {
            final ListAdapter e0 = this.E0;
            return e0 == null || e0.isEnabled(n);
        }
        
        public final void registerDataSetObserver(final DataSetObserver dataSetObserver) {
            final SpinnerAdapter d0 = this.D0;
            if (d0 != null) {
                ((Adapter)d0).registerDataSetObserver(dataSetObserver);
            }
        }
        
        public final void unregisterDataSetObserver(final DataSetObserver dataSetObserver) {
            final SpinnerAdapter d0 = this.D0;
            if (d0 != null) {
                ((Adapter)d0).unregisterDataSetObserver(dataSetObserver);
            }
        }
    }
    
    public final class g extends blf implements h
    {
        public CharSequence f1;
        public ListAdapter g1;
        public final Rect h1;
        public int i1;
        public final AppCompatSpinner j1;
        
        public g(final AppCompatSpinner appCompatSpinner, final Context context, final AttributeSet set, final int n) {
            this.j1 = appCompatSpinner;
            super(context, set, n, 0);
            this.h1 = new Rect();
            super.R0 = (View)appCompatSpinner;
            this.q();
            super.S0 = (AdapterView$OnItemClickListener)new AdapterView$OnItemClickListener(this) {
                public final g D0;
                
                public final void onItemClick(final AdapterView<?> adapterView, final View view, final int selection, final long n) {
                    ((AdapterView)this.D0.j1).setSelection(selection);
                    if (((AdapterView)this.D0.j1).getOnItemClickListener() != null) {
                        final g d0 = this.D0;
                        ((AdapterView)d0.j1).performItemClick(view, selection, ((Adapter)d0.g1).getItemId(selection));
                    }
                    this.D0.dismiss();
                }
            };
        }
        
        @Override
        public final CharSequence d() {
            return this.f1;
        }
        
        @Override
        public final void f(final CharSequence f1) {
            this.f1 = f1;
        }
        
        @Override
        public final void h(final int i1) {
            this.i1 = i1;
        }
        
        @Override
        public final void i(int selectedItemPosition, final int n) {
            final boolean showing = this.isShowing();
            this.s();
            this.p();
            this.show();
            final vi9 f0 = super.F0;
            ((AbsListView)f0).setChoiceMode(1);
            c.d((View)f0, selectedItemPosition);
            c.c((View)f0, n);
            selectedItemPosition = ((AdapterView)this.j1).getSelectedItemPosition();
            final vi9 f2 = super.F0;
            if (this.isShowing() && f2 != null) {
                f2.setListSelectionHidden(false);
                ((AdapterView)f2).setSelection(selectedItemPosition);
                if (((AbsListView)f2).getChoiceMode() != 0) {
                    ((AbsListView)f2).setItemChecked(selectedItemPosition, true);
                }
            }
            if (showing) {
                return;
            }
            final ViewTreeObserver viewTreeObserver = ((View)this.j1).getViewTreeObserver();
            if (viewTreeObserver != null) {
                final ViewTreeObserver$OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener = (ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener(this) {
                    public final g D0;
                    
                    public final void onGlobalLayout() {
                        final g d0 = this.D0;
                        final AppCompatSpinner j1 = d0.j1;
                        Objects.requireNonNull(d0);
                        final WeakHashMap a = j6x.a;
                        if (!j6x$g.b((View)j1) || !((View)j1).getGlobalVisibleRect(d0.h1)) {
                            this.D0.dismiss();
                        }
                        else {
                            this.D0.s();
                            this.D0.show();
                        }
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)viewTreeObserver$OnGlobalLayoutListener);
                this.r((PopupWindow$OnDismissListener)new PopupWindow$OnDismissListener(this, viewTreeObserver$OnGlobalLayoutListener) {
                    public final ViewTreeObserver$OnGlobalLayoutListener D0;
                    public final g E0;
                    
                    public final void onDismiss() {
                        final ViewTreeObserver viewTreeObserver = ((View)this.E0.j1).getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeGlobalOnLayoutListener(this.D0);
                        }
                    }
                });
            }
        }
        
        public final void s() {
            final Drawable e = this.e();
            int right = 0;
            if (e != null) {
                e.getPadding(this.j1.K0);
                if (rcx.b((View)this.j1)) {
                    right = this.j1.K0.right;
                }
                else {
                    right = -this.j1.K0.left;
                }
            }
            else {
                final Rect k0 = this.j1.K0;
                k0.right = 0;
                k0.left = 0;
            }
            final int paddingLeft = ((View)this.j1).getPaddingLeft();
            final int paddingRight = ((View)this.j1).getPaddingRight();
            final int width = ((View)this.j1).getWidth();
            final AppCompatSpinner j1 = this.j1;
            final int j2 = j1.J0;
            if (j2 == -2) {
                final int a = j1.a((SpinnerAdapter)this.g1, this.e());
                final int widthPixels = ((View)this.j1).getContext().getResources().getDisplayMetrics().widthPixels;
                final Rect k2 = this.j1.K0;
                final int n = widthPixels - k2.left - k2.right;
                int n2;
                if ((n2 = a) > n) {
                    n2 = n;
                }
                this.o(Math.max(n2, width - paddingLeft - paddingRight));
            }
            else if (j2 == -1) {
                this.o(width - paddingLeft - paddingRight);
            }
            else {
                this.o(j2);
            }
            int i0;
            if (rcx.b((View)this.j1)) {
                i0 = width - paddingRight - super.H0 - this.i1 + right;
            }
            else {
                i0 = paddingLeft + this.i1 + right;
            }
            super.I0 = i0;
        }
        
        @Override
        public final void setAdapter(final ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.g1 = listAdapter;
        }
    }
    
    public interface h
    {
        int a();
        
        void c(final int p0);
        
        CharSequence d();
        
        void dismiss();
        
        Drawable e();
        
        void f(final CharSequence p0);
        
        void g(final int p0);
        
        void h(final int p0);
        
        void i(final int p0, final int p1);
        
        boolean isShowing();
        
        int j();
        
        void m(final Drawable p0);
        
        void setAdapter(final ListAdapter p0);
    }
}
