import java.util.Comparator;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wfb
{
    public static boolean a(int n, final Rect rect, final Rect rect2, final Rect rect3) {
        final boolean b = b(n, rect, rect2);
        final boolean b2 = b(n, rect, rect3);
        boolean b3 = false;
        if (b2 || !b) {
            return false;
        }
        boolean b4 = false;
        Label_0129: {
            Label_0126: {
                if (n != 17) {
                    if (n != 33) {
                        if (n != 66) {
                            if (n != 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            if (rect.bottom > rect3.top) {
                                break Label_0126;
                            }
                        }
                        else if (rect.right > rect3.left) {
                            break Label_0126;
                        }
                    }
                    else if (rect.top < rect3.bottom) {
                        break Label_0126;
                    }
                }
                else if (rect.left < rect3.right) {
                    break Label_0126;
                }
                b4 = true;
                break Label_0129;
            }
            b4 = false;
        }
        if (!b4) {
            return true;
        }
        if (n != 17 && n != 66) {
            final int d = d(n, rect, rect2);
            int n2;
            if (n != 17) {
                if (n != 33) {
                    if (n != 66) {
                        if (n != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        n = rect3.bottom;
                        n2 = rect.bottom;
                    }
                    else {
                        n = rect3.right;
                        n2 = rect.right;
                    }
                }
                else {
                    n = rect.top;
                    n2 = rect3.top;
                }
            }
            else {
                n = rect.left;
                n2 = rect3.left;
            }
            if (d < Math.max(1, n - n2)) {
                b3 = true;
            }
            return b3;
        }
        return true;
    }
    
    public static boolean b(final int n, final Rect rect, final Rect rect2) {
        final boolean b = false;
        final boolean b2 = false;
        Label_0076: {
            if (n != 17) {
                if (n != 33) {
                    if (n == 66) {
                        break Label_0076;
                    }
                    if (n != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
                boolean b3 = b2;
                if (rect2.right >= rect.left) {
                    b3 = b2;
                    if (rect2.left <= rect.right) {
                        b3 = true;
                    }
                }
                return b3;
            }
        }
        boolean b4 = b;
        if (rect2.bottom >= rect.top) {
            b4 = b;
            if (rect2.top <= rect.bottom) {
                b4 = true;
            }
        }
        return b4;
    }
    
    public static boolean c(final Rect rect, final Rect rect2, int n) {
        final boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        if (n == 17) {
            final int right = rect.right;
            n = rect2.right;
            if (right <= n) {
                final boolean b5 = b3;
                if (rect.left < n) {
                    return b5;
                }
            }
            boolean b5 = b3;
            if (rect.left > rect2.left) {
                b5 = true;
            }
            return b5;
        }
        if (n == 33) {
            final int bottom = rect.bottom;
            n = rect2.bottom;
            if (bottom <= n) {
                final boolean b6 = b2;
                if (rect.top < n) {
                    return b6;
                }
            }
            boolean b6 = b2;
            if (rect.top > rect2.top) {
                b6 = true;
            }
            return b6;
        }
        if (n == 66) {
            final int left = rect.left;
            n = rect2.left;
            if (left >= n) {
                final boolean b7 = b;
                if (rect.right > n) {
                    return b7;
                }
            }
            boolean b7 = b;
            if (rect.right < rect2.right) {
                b7 = true;
            }
            return b7;
        }
        if (n == 130) {
            final int top = rect.top;
            n = rect2.top;
            if (top >= n) {
                final boolean b8 = b4;
                if (rect.bottom > n) {
                    return b8;
                }
            }
            boolean b8 = b4;
            if (rect.bottom < rect2.bottom) {
                b8 = true;
            }
            return b8;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }
    
    public static int d(int n, final Rect rect, final Rect rect2) {
        int n2;
        if (n != 17) {
            if (n != 33) {
                if (n != 66) {
                    if (n != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    n = rect2.top;
                    n2 = rect.bottom;
                }
                else {
                    n = rect2.left;
                    n2 = rect.right;
                }
            }
            else {
                n = rect.top;
                n2 = rect2.bottom;
            }
        }
        else {
            n = rect.left;
            n2 = rect2.right;
        }
        return Math.max(0, n - n2);
    }
    
    public static int e(int n, final Rect rect, final Rect rect2) {
        Label_0073: {
            if (n != 17) {
                if (n != 33) {
                    if (n == 66) {
                        break Label_0073;
                    }
                    if (n != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
                final int left = rect.left;
                final int n2 = rect.width() / 2;
                n = rect2.left;
                return Math.abs(n2 + left - (rect2.width() / 2 + n));
            }
        }
        n = rect.top;
        return Math.abs(rect.height() / 2 + n - (rect2.height() / 2 + rect2.top));
    }
    
    public interface a<T>
    {
    }
    
    public static final class b<T> implements Comparator<T>
    {
        public final Rect F0;
        public final Rect G0;
        public final boolean H0;
        public final a<T> I0;
        
        public b(final boolean h0, final a<T> i0) {
            this.F0 = new Rect();
            this.G0 = new Rect();
            this.H0 = h0;
            this.I0 = i0;
        }
        
        @Override
        public final int compare(final T t, final T t2) {
            final Rect f0 = this.F0;
            final Rect g0 = this.G0;
            ((wia.wia$a)this.I0).a(t, f0);
            ((wia.wia$a)this.I0).a(t2, g0);
            final int top = f0.top;
            final int top2 = g0.top;
            int n = -1;
            if (top < top2) {
                return -1;
            }
            if (top > top2) {
                return 1;
            }
            final int left = f0.left;
            final int left2 = g0.left;
            if (left < left2) {
                if (this.H0) {
                    n = 1;
                }
                return n;
            }
            if (left > left2) {
                if (!this.H0) {
                    n = 1;
                }
                return n;
            }
            final int bottom = f0.bottom;
            final int bottom2 = g0.bottom;
            if (bottom < bottom2) {
                return -1;
            }
            if (bottom > bottom2) {
                return 1;
            }
            final int right = f0.right;
            final int right2 = g0.right;
            if (right < right2) {
                if (this.H0) {
                    n = 1;
                }
                return n;
            }
            if (right > right2) {
                if (!this.H0) {
                    n = 1;
                }
                return n;
            }
            return 0;
        }
    }
}
