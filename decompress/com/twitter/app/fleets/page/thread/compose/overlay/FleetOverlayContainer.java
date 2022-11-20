// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.fleets.page.thread.compose.overlay;

import android.widget.ImageView;
import android.text.Layout;
import androidx.appcompat.widget.AppCompatTextView;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Animatable;
import java.util.Iterator;
import java.util.List;
import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Region;
import android.text.TextPaint;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import kotlin.NoWhenBranchMatchedException;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.widget.TextView;
import java.util.Objects;
import android.graphics.Paint;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.text.Editable$Factory;
import android.graphics.RectF;
import android.graphics.Path;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import android.widget.FrameLayout;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013" }, d2 = { "Lcom/twitter/app/fleets/page/thread/compose/overlay/FleetOverlayContainer;", "Landroid/widget/FrameLayout;", "", "value", "D0", "Z", "getShouldFadeOutOfBoundsOverlays", "()Z", "setShouldFadeOutOfBoundsOverlays", "(Z)V", "shouldFadeOutOfBoundsOverlays", "Landroid/graphics/Paint;", "outOfBoundsAlphaPaint$delegate", "Lqwe;", "getOutOfBoundsAlphaPaint", "()Landroid/graphics/Paint;", "outOfBoundsAlphaPaint", "Companion", "a", "feature.tfa.fleets.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class FleetOverlayContainer extends FrameLayout
{
    public static final a Companion;
    public boolean D0;
    public View E0;
    public final int F0;
    public final n4s G0;
    
    static {
        Companion = new a();
    }
    
    public FleetOverlayContainer(final Context context, final AttributeSet set) {
        czd.f((Object)context, "context");
        super(context, set, 0);
        this.D0 = true;
        this.F0 = context.getResources().getDimensionPixelOffset(2131167432);
        new Path();
        new RectF();
        this.G0 = (n4s)pps.n((nsb)m2b.D0);
        if (((View)this).isInEditMode()) {
            final w2b w2b = new w2b(context);
            w2b.setFleetText(Editable$Factory.getInstance().newEditable((CharSequence)"Hello Fleets\nWhat is happening?"));
            ((AppCompatTextView)w2b).setTextSize(0, 100.0f);
            ((View)w2b).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2, 17));
            ((TextView)w2b).setTextColor(-16777216);
            ((View)w2b).setLayerType(1, (Paint)null);
            final u4b textHelper = w2b.getTextHelper();
            Objects.requireNonNull(textHelper);
            textHelper.e = 1;
            final fjs b = textHelper.b;
            b.N0.setColor(0);
            b.N0.setAntiAlias(true);
            final TextView a = textHelper.a;
            a.setTextColor(kn6.b(((View)a).getContext(), wk0.d(textHelper.e)));
            final TextView a2 = textHelper.a;
            a2.setHighlightColor(kn6.b(((View)a2).getContext(), 2131100886));
            ((View)textHelper.a).invalidate();
            ((ViewGroup)this).addView((View)w2b);
            final p2b p2b = new p2b(context);
            ((View)p2b).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1, 17));
            ((View)p2b).setLayerType(1, (Paint)null);
            ((ViewGroup)this).addView((View)p2b);
            final eou eou = new eou(context);
            ((View)eou).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -2, 17));
            ((View)eou).setLayerType(1, (Paint)null);
            ((ViewGroup)this).addView((View)eou);
        }
    }
    
    private final Paint getOutOfBoundsAlphaPaint() {
        return (Paint)this.G0.getValue();
    }
    
    public final void a(MotionEvent obtain) {
        final View e0 = this.E0;
        if (e0 != null) {
            if (obtain.getAction() == 3) {
                e0.dispatchTouchEvent(obtain);
            }
            else {
                obtain = MotionEvent.obtain(obtain);
                czd.e((Object)obtain, "obtain(event)");
                obtain.offsetLocation((float)(((View)this).getScrollX() - e0.getLeft()), (float)(((View)this).getScrollY() - e0.getTop()));
                final Matrix matrix = new Matrix();
                e0.getMatrix().invert(matrix);
                obtain.transform(matrix);
                e0.dispatchTouchEvent(obtain);
                obtain.recycle();
            }
        }
    }
    
    public final void dispatchDraw(final Canvas canvas) {
        czd.f((Object)canvas, "canvas");
        final mza$a mza$a = new mza$a((mza)kkp.k0((xjp)r7x.b((ViewGroup)this), (qsb)FleetOverlayContainer$b.D0));
        while (mza$a.hasNext()) {
            final View view = (View)mza$a.next();
            if (view instanceof w2b) {
                final w2b w2b = (w2b)view;
                Objects.requireNonNull(w2b.getTextHelper());
                final TextPaint paint = ((TextView)w2b).getPaint();
                final float textSize = ((Paint)paint).getTextSize();
                final int color = ((Paint)paint).getColor();
                final int alpha = ((Paint)paint).getAlpha();
                final Rect rect = new Rect();
                ((Paint)paint).setColor(((TextView)w2b).getTextColors().getDefaultColor());
                ((Paint)paint).setTextSize(((View)w2b).getScaleY() * textSize);
                ((Paint)paint).setAlpha((int)(((View)w2b).getAlpha() * 255));
                ((View)w2b).getHitRect(rect);
                final int n = canvas.getHeight() / 2;
                final int n2 = canvas.getWidth() / 2;
                final float n3 = ((View)w2b).getScaleX() * ((View)w2b).getWidth();
                final float n4 = (float)((View)w2b).getHeight();
                final float scaleY = ((View)w2b).getScaleY();
                final float n5 = (float)((View)w2b).getPaddingTop();
                final float scaleY2 = ((View)w2b).getScaleY();
                final float n6 = (float)n;
                final float n7 = scaleY * n4 / 2.0f;
                final int e = ib0.E(w2b.getTextHelper().f);
                Layout$Alignment layout$Alignment;
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        layout$Alignment = Layout$Alignment.ALIGN_OPPOSITE;
                    }
                    else {
                        layout$Alignment = Layout$Alignment.ALIGN_CENTER;
                    }
                }
                else {
                    layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
                }
                final fjs b = w2b.getTextHelper().b;
                final int alpha2 = ((Paint)paint).getAlpha();
                if (b.N0.getAlpha() != 0) {
                    b.N0.setAlpha(alpha2);
                }
                final fjs b2 = w2b.getTextHelper().b;
                final float scaleX = ((View)w2b).getScaleX();
                b2.L0 = b2.E0 * scaleX;
                b2.M0 = scaleX * b2.D0;
                final fjs b3 = w2b.getTextHelper().b;
                b3.H0 = -1.0f;
                b3.I0 = -1.0f;
                b3.J0 = -1.0f;
                b3.K0 = -1.0f;
                final float n8 = (float)(rect.centerX() - n2);
                final float n9 = (float)(rect.centerY() - n);
                final int save = canvas.save();
                canvas.translate(n8, n9);
                try {
                    final float rotation = ((View)w2b).getRotation();
                    final float n10 = (float)n2;
                    canvas.rotate(rotation, n10, n6);
                    canvas.translate(n10 - n3 / 2.0f, n6 - n7 + scaleY2 * n5);
                    final CharSequence text = ((AppCompatTextView)w2b).getText();
                    final int n11 = zyz.n(n3);
                    final float n12 = 2;
                    final float a = m5s.a;
                    try {
                        ((Layout)new StaticLayout(text, paint, n11, layout$Alignment, 1.0f, n12 * a, true)).draw(canvas);
                        canvas.restoreToCount(save);
                        ((Paint)paint).setColor(color);
                        ((Paint)paint).setTextSize(textSize);
                        ((Paint)paint).setAlpha(alpha);
                    }
                    finally {}
                }
                finally {}
                canvas.restoreToCount(save);
            }
            else if (view instanceof kqj) {
                ((ViewGroup)this).drawChild(canvas, view, 0L);
            }
            view.setFocusable(true);
        }
    }
    
    public final boolean getShouldFadeOutOfBoundsOverlays() {
        return this.D0;
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        czd.f((Object)motionEvent, "e");
        return true;
    }
    
    public final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        czd.f((Object)motionEvent, "e");
        final int action = motionEvent.getAction();
        int n = 1;
        final int n2 = 1;
        if (action != 0) {
            if (action != 1 && action != 3) {
                this.a(motionEvent);
            }
            else {
                this.a(motionEvent);
                this.E0 = null;
            }
        }
        else {
            Iterator iterator = ((r7x$a)r7x.b((ViewGroup)this)).iterator();
            View view = null;
            n = n2;
            while (true) {
                final s7x s7x = (s7x)iterator;
                if (!s7x.hasNext()) {
                    break;
                }
                Object next = s7x.next();
                final View view2 = (View)next;
                final float x = motionEvent.getX();
                final float n3 = (float)(((View)this).getScrollX() - view2.getLeft());
                final float y = motionEvent.getY();
                final float n4 = (float)(((View)this).getScrollY() - view2.getTop());
                final Matrix matrix = new Matrix();
                view2.getMatrix().invert(matrix);
                final float[] array = { x + n3, 0.0f };
                array[n] = y + n4;
                matrix.mapPoints(array);
                final float n5 = array[0];
                final float n6 = array[n];
                final float[] array2 = new float[9];
                view2.getMatrix().getValues(array2);
                final double pow = Math.pow(array2[0], 2.0);
                final float n7 = array2[n];
                final View view3 = view;
                final int m = zyz.m(this.F0 / Math.sqrt(Math.pow(n7, 2.0) + pow));
                View view4;
                s7x s7x3;
                boolean b5;
                if (view2 instanceof p2b) {
                    final q2b stickerHelper = ((p2b)view2).getStickerHelper();
                    final Region b = stickerHelper.b;
                    final qd9 controller = ((ud9)stickerHelper.a).getController();
                    Animatable l;
                    if (controller != null) {
                        l = controller.l();
                    }
                    else {
                        l = null;
                    }
                    final boolean b2 = l != null;
                    Region region;
                    if (b != null && !b2) {
                        final s7x s7x2 = (s7x)iterator;
                        view4 = (View)next;
                        region = b;
                        s7x3 = s7x2;
                    }
                    else {
                        final Region b3 = new Region();
                        final Drawable drawable = ((ImageView)stickerHelper.a).getDrawable();
                        czd.e((Object)drawable, "overlayView.drawable");
                        final Bitmap bitmap = Bitmap.createBitmap(64, 64, Bitmap$Config.ALPHA_8);
                        final Canvas canvas = new Canvas(bitmap);
                        final float min = Math.min(bitmap.getWidth() / (float)drawable.getBounds().width(), bitmap.getHeight() / (float)drawable.getBounds().height());
                        canvas.scale(min, min);
                        drawable.draw(canvas);
                        final ArrayList<PointF> list = new ArrayList<PointF>();
                        final ArrayList<PointF> list2 = new ArrayList<PointF>();
                        int n8 = 64;
                        int n9 = 0;
                        int n10 = 0;
                        s7x s7x4 = (s7x)iterator;
                        while (true) {
                            int n11;
                            int n16;
                            if (n9 < 64) {
                                int i = 0;
                                n11 = 64;
                                int n12 = 0;
                                while (i < 64) {
                                    final boolean b4 = Color.alpha(bitmap.getPixel(i, n9)) >= 128;
                                    int n13 = n11;
                                    int n14 = n12;
                                    if (b4) {
                                        int n15;
                                        if (i < (n15 = n11)) {
                                            n15 = i;
                                        }
                                        n14 = i + 1;
                                        n13 = n15;
                                    }
                                    ++i;
                                    n11 = n13;
                                    n12 = n14;
                                }
                                view4 = (View)next;
                                n16 = n12;
                            }
                            else {
                                view4 = (View)next;
                                n16 = 0;
                                n11 = 64;
                            }
                            s7x3 = s7x4;
                            if (n11 != 64 || n8 != 64) {
                                if (n11 != n8) {
                                    list.add(new PointF((float)Math.min(n11, n8), (float)n9));
                                }
                                if (n16 != n10) {
                                    list2.add(new PointF((float)Math.max(n16, n10), (float)n9));
                                }
                            }
                            if (n9 == 64) {
                                break;
                            }
                            ++n9;
                            s7x4 = s7x3;
                            n8 = n11;
                            next = view4;
                            n10 = n16;
                        }
                        Path path;
                        if (list.isEmpty()) {
                            path = null;
                        }
                        else {
                            path = new Path();
                            final PointF pointF = (PointF)mq4.g0((List)list);
                            path.moveTo(pointF.x, pointF.y);
                            for (final PointF pointF2 : mq4.b0((Iterable)list)) {
                                path.lineTo(pointF2.x, pointF2.y);
                            }
                            for (final PointF pointF3 : mq4.z0((Iterable)list2)) {
                                path.lineTo(pointF3.x, pointF3.y);
                            }
                            path.close();
                            final Matrix matrix2 = new Matrix();
                            final float n17 = 1 / min;
                            matrix2.setScale(n17, n17);
                            path.transform(matrix2);
                        }
                        n = 1;
                        if (path != null) {
                            final RectF rectF = new RectF();
                            path.computeBounds(rectF, true);
                            final Rect rect = new Rect();
                            rectF.roundOut(rect);
                            b3.setPath(path, new Region(rect));
                        }
                        else {
                            b3.set(0, 0, ((View)stickerHelper.a).getWidth(), ((View)stickerHelper.a).getHeight());
                        }
                        stickerHelper.b = b3;
                        region = b3;
                    }
                    b5 = region.contains(zyz.n(n5), zyz.n(n6));
                }
                else {
                    final s7x s7x5 = (s7x)iterator;
                    view4 = (View)next;
                    Rect rect2;
                    if (view2 instanceof w2b) {
                        final w2b w2b = (w2b)view2;
                        Objects.requireNonNull(w2b.getTextHelper());
                        final int n18 = (int)((View)w2b).getResources().getDimension(2131167565);
                        rect2 = new Rect(0, 0, ((View)w2b).getWidth(), ((View)w2b).getHeight());
                        rect2.left += n18;
                        final int top = rect2.top + n18;
                        rect2.top = top;
                        rect2.right -= n18;
                        rect2.bottom -= n18;
                        final Integer c = w2b.getTextHelper().c;
                        int intValue;
                        if (c != null) {
                            intValue = c;
                        }
                        else {
                            intValue = 0;
                        }
                        rect2.top = top + intValue;
                        final int bottom = rect2.bottom;
                        final Integer d = w2b.getTextHelper().d;
                        int intValue2;
                        if (d != null) {
                            intValue2 = d;
                        }
                        else {
                            intValue2 = 0;
                        }
                        rect2.bottom = bottom + intValue2;
                    }
                    else {
                        rect2 = new Rect(0, 0, view2.getWidth(), view2.getHeight());
                    }
                    final int n19 = -m;
                    rect2.inset(n19, n19);
                    b5 = rect2.contains(zyz.n(n5), zyz.n(n6));
                    s7x3 = s7x5;
                }
                view = view3;
                if (b5) {
                    view = view4;
                }
                iterator = s7x3;
            }
            ((ViewGroup)this).bringChildToFront(this.E0 = view);
            this.a(motionEvent);
        }
        ((View)this).requestLayout();
        if (this.E0 == null) {
            n = 0;
        }
        return n != 0;
    }
    
    public final void setShouldFadeOutOfBoundsOverlays(final boolean d0) {
        this.D0 = d0;
        ((View)this).invalidate();
    }
    
    public static final class a
    {
    }
}
