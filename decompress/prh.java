import java.util.Objects;
import android.os.Build$VERSION;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class prh
{
    public long a;
    public final SparseLongArray b;
    public final SparseBooleanArray c;
    public final List<wpk> d;
    public int e;
    public int f;
    
    public prh() {
        this.b = new SparseLongArray();
        this.c = new SparseBooleanArray();
        this.d = new ArrayList();
        this.e = -1;
        this.f = -1;
    }
    
    public final vpk a(final MotionEvent motionEvent, final ksk ksk) {
        e0e.f((Object)motionEvent, "motionEvent");
        e0e.f((Object)ksk, "positionCalculator");
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.b.clear();
            this.c.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            final int toolType = motionEvent.getToolType(0);
            final int source = motionEvent.getSource();
            if (toolType != this.e || source != this.f) {
                this.e = toolType;
                this.f = source;
                this.c.clear();
                this.b.clear();
            }
        }
        final int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 != 0 && actionMasked2 != 5) {
            if (actionMasked2 == 9) {
                final int pointerId = motionEvent.getPointerId(0);
                if (this.b.indexOfKey(pointerId) < 0) {
                    this.b.put(pointerId, this.a++);
                }
            }
        }
        else {
            final int actionIndex = motionEvent.getActionIndex();
            final int pointerId2 = motionEvent.getPointerId(actionIndex);
            if (this.b.indexOfKey(pointerId2) < 0) {
                final SparseLongArray b = this.b;
                final long a = this.a;
                this.a = 1L + a;
                b.put(pointerId2, a);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    this.c.put(pointerId2, true);
                }
            }
        }
        final boolean b2 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        final boolean b3 = actionMasked == 8;
        if (b2) {
            this.c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex2;
        if (actionMasked != 1) {
            if (actionMasked != 6) {
                actionIndex2 = -1;
            }
            else {
                actionIndex2 = motionEvent.getActionIndex();
            }
        }
        else {
            actionIndex2 = 0;
        }
        this.d.clear();
        final int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        final boolean b4 = b2;
        while (i < pointerCount) {
            final ArrayList d = this.d;
            final boolean b5 = !b4 && i != actionIndex2 && (!b3 || motionEvent.getButtonState() != 0);
            final int pointerId3 = motionEvent.getPointerId(i);
            final int indexOfKey = this.b.indexOfKey(pointerId3);
            long value;
            if (indexOfKey >= 0) {
                value = this.b.valueAt(indexOfKey);
            }
            else {
                value = this.a++;
                this.b.put(pointerId3, value);
            }
            final float pressure = motionEvent.getPressure(i);
            long e = kqe.e(motionEvent.getX(i), motionEvent.getY(i));
            long v = 0L;
            Label_0608: {
                long n;
                long n2;
                if (i == 0) {
                    n = kqe.e(motionEvent.getRawX(), motionEvent.getRawY());
                    n2 = ksk.i(n);
                }
                else {
                    if (Build$VERSION.SDK_INT < 29) {
                        v = ksk.v(e);
                        break Label_0608;
                    }
                    n = qrh.a.a(motionEvent, i);
                    n2 = ksk.i(n);
                }
                final long n3 = n;
                e = n2;
                v = n3;
            }
            final int toolType2 = motionEvent.getToolType(i);
            int n4 = 0;
            Label_0717: {
                if (toolType2 != 0) {
                    if (toolType2 == 1) {
                        Objects.requireNonNull(fqk.Companion);
                        n4 = 1;
                        break Label_0717;
                    }
                    if (toolType2 == 2) {
                        Objects.requireNonNull(fqk.Companion);
                        n4 = 3;
                        break Label_0717;
                    }
                    if (toolType2 == 3) {
                        Objects.requireNonNull(fqk.Companion);
                        n4 = 2;
                        break Label_0717;
                    }
                    if (toolType2 == 4) {
                        Objects.requireNonNull(fqk.Companion);
                        n4 = 4;
                        break Label_0717;
                    }
                    Objects.requireNonNull(fqk.Companion);
                }
                else {
                    Objects.requireNonNull(fqk.Companion);
                }
                n4 = 0;
            }
            final ArrayList<jlc> list = new ArrayList<jlc>();
            for (int historySize = motionEvent.getHistorySize(), j = 0; j < historySize; ++j) {
                final float historicalX = motionEvent.getHistoricalX(i, j);
                final float historicalY = motionEvent.getHistoricalY(i, j);
                if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && (!Float.isInfinite(historicalY) && !Float.isNaN(historicalY))) {
                    list.add(new jlc(motionEvent.getHistoricalEventTime(j), kqe.e(historicalX, historicalY)));
                }
            }
            long n5;
            if (motionEvent.getActionMasked() == 8) {
                n5 = kqe.e(motionEvent.getAxisValue(10), -motionEvent.getAxisValue(9) + 0.0f);
            }
            else {
                Objects.requireNonNull(kgj.Companion);
                n5 = kgj.b;
            }
            d.add(new wpk(value, motionEvent.getEventTime(), v, e, b5, pressure, n4, this.c.get(motionEvent.getPointerId(i), false), (List)list, n5, (wg8)null));
            ++i;
        }
        final int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            final int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.c.get(pointerId4, false)) {
                this.b.delete(pointerId4);
                this.c.delete(pointerId4);
            }
        }
        if (this.b.size() > motionEvent.getPointerCount()) {
            int n6 = this.b.size() - 1;
        Label_1040:
            while (-1 < n6) {
                final int key = this.b.keyAt(n6);
                while (true) {
                    for (int pointerCount2 = motionEvent.getPointerCount(), k = 0; k < pointerCount2; ++k) {
                        if (motionEvent.getPointerId(k) == key) {
                            final boolean b6 = true;
                            if (!b6) {
                                this.b.removeAt(n6);
                                this.c.delete(key);
                            }
                            --n6;
                            continue Label_1040;
                        }
                    }
                    final boolean b6 = false;
                    continue;
                }
            }
        }
        return new vpk(motionEvent.getEventTime(), (List)this.d, motionEvent);
    }
}
