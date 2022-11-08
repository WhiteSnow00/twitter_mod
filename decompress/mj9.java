import android.widget.Adapter;
import android.widget.AdapterView;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.ListAdapter;
import android.graphics.drawable.Drawable;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.util.AttributeSet;
import android.content.Context;
import java.lang.reflect.Field;
import android.graphics.Rect;
import android.widget.ListView;

// 
// Decompiled by Procyon v0.6.0
// 

public class mj9 extends ListView
{
    public final Rect C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public Field I0;
    public mj9.mj9$c J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public vmf N0;
    public d O0;
    
    public mj9(final Context context, final boolean l0) {
        super(context, (AttributeSet)null, 2130969271);
        this.C0 = new Rect();
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = 0;
        this.L0 = l0;
        ((AbsListView)this).setCacheColorHint(0);
        try {
            (this.I0 = AbsListView.class.getDeclaredField("mIsChildViewEnabled")).setAccessible(true);
        }
        catch (final NoSuchFieldException ex) {
            ex.printStackTrace();
        }
    }
    
    private void setSelectorEnabled(final boolean d0) {
        final mj9.mj9$c j0 = this.J0;
        if (j0 != null) {
            j0.D0 = d0;
        }
    }
    
    public final int a(final int n, final int n2) {
        final int listPaddingTop = ((AbsListView)this).getListPaddingTop();
        final int listPaddingBottom = ((AbsListView)this).getListPaddingBottom();
        int dividerHeight = this.getDividerHeight();
        final Drawable divider = this.getDivider();
        final ListAdapter adapter = this.getAdapter();
        int n3 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return n3;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        final int count = ((Adapter)adapter).getCount();
        View view = null;
        int i = 0;
        int n4 = 0;
        while (i < count) {
            final int itemViewType = ((Adapter)adapter).getItemViewType(i);
            int n5;
            if (itemViewType != (n5 = n4)) {
                view = null;
                n5 = itemViewType;
            }
            final View view2 = ((Adapter)adapter).getView(i, view, (ViewGroup)this);
            ViewGroup$LayoutParams layoutParams;
            if ((layoutParams = view2.getLayoutParams()) == null) {
                layoutParams = ((ViewGroup)this).generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams);
            }
            final int height = layoutParams.height;
            int n6;
            if (height > 0) {
                n6 = View$MeasureSpec.makeMeasureSpec(height, 1073741824);
            }
            else {
                n6 = View$MeasureSpec.makeMeasureSpec(0, 0);
            }
            view2.measure(n, n6);
            view2.forceLayout();
            int n7 = n3;
            if (i > 0) {
                n7 = n3 + dividerHeight;
            }
            n3 = n7 + view2.getMeasuredHeight();
            if (n3 >= n2) {
                return n2;
            }
            ++i;
            n4 = n5;
            view = view2;
        }
        return n3;
    }
    
    public final boolean b(final MotionEvent motionEvent, int h0) {
        final int actionMasked = motionEvent.getActionMasked();
        final int n = 1;
        boolean b = false;
        Label_0549: {
            Label_0547: {
                Label_0544: {
                    Label_0047: {
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    break Label_0544;
                                }
                                break Label_0047;
                            }
                            else {
                                b = true;
                            }
                        }
                        else {
                            b = false;
                        }
                        final int pointerIndex = motionEvent.findPointerIndex(h0);
                        if (pointerIndex >= 0) {
                            h0 = (int)motionEvent.getX(pointerIndex);
                            final int n2 = (int)motionEvent.getY(pointerIndex);
                            final int pointToPosition = ((AbsListView)this).pointToPosition(h0, n2);
                            if (pointToPosition == -1) {
                                h0 = n;
                                break Label_0549;
                            }
                            final View child = ((ViewGroup)this).getChildAt(pointToPosition - ((AdapterView)this).getFirstVisiblePosition());
                            final float n3 = (float)h0;
                            final float n4 = (float)n2;
                            this.M0 = true;
                            a.a((View)this, n3, n4);
                            if (!((View)this).isPressed()) {
                                ((View)this).setPressed(true);
                            }
                            ((AbsListView)this).layoutChildren();
                            h0 = this.H0;
                            if (h0 != -1) {
                                final View child2 = ((ViewGroup)this).getChildAt(h0 - ((AdapterView)this).getFirstVisiblePosition());
                                if (child2 != null && child2 != child && child2.isPressed()) {
                                    child2.setPressed(false);
                                }
                            }
                            this.H0 = pointToPosition;
                            a.a(child, n3 - child.getLeft(), n4 - child.getTop());
                            if (!child.isPressed()) {
                                child.setPressed(true);
                            }
                            final Drawable selector = ((AbsListView)this).getSelector();
                            if (selector != null && pointToPosition != -1) {
                                h0 = 1;
                            }
                            else {
                                h0 = 0;
                            }
                            if (h0 != 0) {
                                selector.setVisible(false, false);
                            }
                            final Rect c0 = this.C0;
                            c0.set(child.getLeft(), child.getTop(), child.getRight(), child.getBottom());
                            c0.left -= this.D0;
                            c0.top -= this.E0;
                            c0.right += this.F0;
                            c0.bottom += this.G0;
                            try {
                                final boolean boolean1 = this.I0.getBoolean(this);
                                if (child.isEnabled() != boolean1) {
                                    this.I0.set(this, !boolean1);
                                    if (pointToPosition != -1) {
                                        ((View)this).refreshDrawableState();
                                    }
                                }
                            }
                            catch (final IllegalAccessException ex) {
                                ex.printStackTrace();
                            }
                            if (h0 != 0) {
                                final Rect c2 = this.C0;
                                final float exactCenterX = c2.exactCenterX();
                                final float exactCenterY = c2.exactCenterY();
                                selector.setVisible(((View)this).getVisibility() == 0, false);
                                pd9.b.e(selector, exactCenterX, exactCenterY);
                            }
                            final Drawable selector2 = ((AbsListView)this).getSelector();
                            if (selector2 != null && pointToPosition != -1) {
                                pd9.b.e(selector2, n3, n4);
                            }
                            this.setSelectorEnabled(false);
                            ((View)this).refreshDrawableState();
                            if (actionMasked == 1) {
                                ((AdapterView)this).performItemClick(child, pointToPosition, ((AdapterView)this).getItemIdAtPosition(pointToPosition));
                            }
                            break Label_0544;
                        }
                    }
                    b = false;
                    break Label_0547;
                }
                b = true;
            }
            h0 = 0;
        }
        if (!b || h0 != 0) {
            ((View)this).setPressed(this.M0 = false);
            this.drawableStateChanged();
            final View child3 = ((ViewGroup)this).getChildAt(this.H0 - ((AdapterView)this).getFirstVisiblePosition());
            if (child3 != null) {
                child3.setPressed(false);
            }
        }
        if (b) {
            if (this.N0 == null) {
                this.N0 = new vmf((ListView)this);
            }
            final vmf n5 = this.N0;
            final boolean r0 = ((b91)n5).R0;
            ((b91)n5).R0 = true;
            ((b91)n5).onTouch((View)this, motionEvent);
        }
        else {
            final vmf n6 = this.N0;
            if (n6 != null) {
                if (((b91)n6).R0) {
                    ((b91)n6).d();
                }
                ((b91)n6).R0 = false;
            }
        }
        return b;
    }
    
    public final void c() {
        final Drawable selector = ((AbsListView)this).getSelector();
        if (selector != null && this.M0 && ((View)this).isPressed()) {
            selector.setState(((View)this).getDrawableState());
        }
    }
    
    public final void dispatchDraw(final Canvas canvas) {
        if (!this.C0.isEmpty()) {
            final Drawable selector = ((AbsListView)this).getSelector();
            if (selector != null) {
                selector.setBounds(this.C0);
                selector.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }
    
    public final void drawableStateChanged() {
        if (this.O0 != null) {
            return;
        }
        super.drawableStateChanged();
        this.setSelectorEnabled(true);
        this.c();
    }
    
    public final boolean hasFocus() {
        return this.L0 || super.hasFocus();
    }
    
    public final boolean hasWindowFocus() {
        return this.L0 || super.hasWindowFocus();
    }
    
    public final boolean isFocused() {
        return this.L0 || super.isFocused();
    }
    
    public final boolean isInTouchMode() {
        return (this.L0 && this.K0) || super.isInTouchMode();
    }
    
    public final void onDetachedFromWindow() {
        this.O0 = null;
        super.onDetachedFromWindow();
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.O0 == null) {
            ((View)this).post((Runnable)(this.O0 = new d()));
        }
        final boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            ((AdapterView)this).setSelection(-1);
        }
        else {
            final int pointToPosition = ((AbsListView)this).pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != ((AdapterView)this).getSelectedItemPosition()) {
                final View child = ((ViewGroup)this).getChildAt(pointToPosition - ((AdapterView)this).getFirstVisiblePosition());
                if (child.isEnabled()) {
                    ((View)this).requestFocus();
                    if (sdk_INT >= 30 && b.d) {
                        try {
                            b.a.invoke(this, pointToPosition, child, Boolean.FALSE, -1, -1);
                            b.b.invoke(this, pointToPosition);
                            b.c.invoke(this, pointToPosition);
                        }
                        catch (final InvocationTargetException ex) {
                            ex.printStackTrace();
                        }
                        catch (final IllegalAccessException ex2) {
                            ex2.printStackTrace();
                        }
                    }
                    else {
                        ((AbsListView)this).setSelectionFromTop(pointToPosition, child.getTop() - ((View)this).getTop());
                    }
                }
                this.c();
            }
        }
        return onHoverEvent;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.H0 = ((AbsListView)this).pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
        }
        final d o0 = this.O0;
        if (o0 != null) {
            final mj9 c0 = o0.C0;
            c0.O0 = null;
            ((View)c0).removeCallbacks((Runnable)o0);
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setListSelectionHidden(final boolean k0) {
        this.K0 = k0;
    }
    
    public void setSelector(final Drawable drawable) {
        mj9.mj9$c j0;
        if (drawable != null) {
            j0 = new mj9.mj9$c(drawable);
        }
        else {
            j0 = null;
        }
        super.setSelector((Drawable)(this.J0 = j0));
        final Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.D0 = rect.left;
        this.E0 = rect.top;
        this.F0 = rect.right;
        this.G0 = rect.bottom;
    }
    
    public static final class a
    {
        public static void a(final View view, final float n, final float n2) {
            view.drawableHotspotChanged(n, n2);
        }
    }
    
    public static final class b
    {
        public static Method a;
        public static Method b;
        public static Method c;
        public static boolean d;
        
        static {
            try {
                final Class<Integer> type = Integer.TYPE;
                final Class<Boolean> type2 = Boolean.TYPE;
                final Class<Float> type3 = Float.TYPE;
                (mj9.b.a = AbsListView.class.getDeclaredMethod("positionSelector", type, View.class, type2, type3, type3)).setAccessible(true);
                (mj9.b.b = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", type)).setAccessible(true);
                (mj9.b.c = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", type)).setAccessible(true);
                mj9.b.d = true;
            }
            catch (final NoSuchMethodException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public final class d implements Runnable
    {
        public final /* synthetic */ mj9 C0;
        
        @Override
        public final void run() {
            final mj9 c0 = mj9.this;
            c0.O0 = null;
            c0.drawableStateChanged();
        }
    }
}
