import java.util.Objects;
import android.content.res.Resources$NotFoundException;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.InflateException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.util.TypedValue;
import android.content.res.TypedArray;
import java.util.Iterator;
import android.animation.TypeEvaluator;
import android.animation.PropertyValuesHolder;
import java.util.ArrayList;
import android.animation.TimeInterpolator;
import android.view.animation.AnimationUtils;
import android.animation.Keyframe;
import android.util.Xml;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oc0
{
    public static Animator a(final Context context, final Resources resources, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser, final AttributeSet set, final AnimatorSet set2, final int n) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        Object o = null;
        ArrayList list = null;
        while (true) {
            final int next = xmlPullParser.next();
            int n2 = 3;
            boolean b = false;
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                if (set2 != null && list != null) {
                    final Animator[] array = new Animator[list.size()];
                    final Iterator iterator = list.iterator();
                    int n3 = 0;
                    while (iterator.hasNext()) {
                        array[n3] = (Animator)iterator.next();
                        ++n3;
                    }
                    if (n == 0) {
                        set2.playTogether(array);
                    }
                    else {
                        set2.playSequentially(array);
                    }
                }
                return (Animator)o;
            }
            if (next != 2) {
                continue;
            }
            final String name = xmlPullParser.getName();
            Object e;
            if (name.equals("objectAnimator")) {
                e = new ObjectAnimator();
                e(context, resources, resources$Theme, set, (ValueAnimator)e, xmlPullParser);
            }
            else if (name.equals("animator")) {
                e = e(context, resources, resources$Theme, set, null, xmlPullParser);
            }
            else if (name.equals("set")) {
                e = new AnimatorSet();
                final TypedArray o2 = nmv.o(resources, resources$Theme, set, b60.h);
                a(context, resources, resources$Theme, xmlPullParser, set, (AnimatorSet)e, nmv.h(o2, xmlPullParser, "ordering", 0, 0));
                o2.recycle();
            }
            else {
                final String s = "propertyValuesHolder";
                if (!name.equals("propertyValuesHolder")) {
                    final StringBuilder f = ehk.f("Unknown animator name: ");
                    f.append(xmlPullParser.getName());
                    throw new RuntimeException(f.toString());
                }
                final AttributeSet attributeSet = Xml.asAttributeSet(xmlPullParser);
                ArrayList list2 = null;
                while (true) {
                    final int eventType = xmlPullParser.getEventType();
                    if (eventType == n2 || eventType == 1) {
                        break;
                    }
                    if (eventType != 2) {
                        xmlPullParser.next();
                    }
                    else {
                        ArrayList list5;
                        if (xmlPullParser.getName().equals(s)) {
                            final TypedArray o3 = nmv.o(resources, resources$Theme, attributeSet, b60.i);
                            final String j = nmv.j(o3, xmlPullParser, "propertyName", n2);
                            final int h = nmv.h(o3, xmlPullParser, "valueType", 2, 4);
                            ArrayList<Keyframe> list3 = null;
                            int n4 = h;
                            final int n5 = depth;
                            while (true) {
                                final int next2 = xmlPullParser.next();
                                if (next2 == n2 || next2 == 1) {
                                    break;
                                }
                                int n6;
                                if (xmlPullParser.getName().equals("keyframe")) {
                                    if ((n6 = n4) == 4) {
                                        final TypedArray o4 = nmv.o(resources, resources$Theme, Xml.asAttributeSet(xmlPullParser), b60.j);
                                        TypedValue peekValue;
                                        if (!nmv.n(xmlPullParser, "value")) {
                                            peekValue = null;
                                        }
                                        else {
                                            peekValue = o4.peekValue(0);
                                        }
                                        if (peekValue != null && d(peekValue.type)) {
                                            n6 = 3;
                                        }
                                        else {
                                            n6 = 0;
                                        }
                                        o4.recycle();
                                    }
                                    final TypedArray o5 = nmv.o(resources, resources$Theme, Xml.asAttributeSet(xmlPullParser), b60.j);
                                    final float g = nmv.g(o5, xmlPullParser, "fraction", 3, -1.0f);
                                    TypedValue peekValue2;
                                    if (!nmv.n(xmlPullParser, "value")) {
                                        peekValue2 = null;
                                    }
                                    else {
                                        peekValue2 = o5.peekValue(0);
                                    }
                                    final boolean b2 = peekValue2 != null;
                                    int n7;
                                    if (n6 == 4) {
                                        if (b2 && d(peekValue2.type)) {
                                            n7 = 3;
                                        }
                                        else {
                                            n7 = 0;
                                        }
                                    }
                                    else {
                                        n7 = n6;
                                    }
                                    Keyframe keyframe;
                                    if (b2) {
                                        if (n7 != 0) {
                                            if (n7 != 1 && n7 != 3) {
                                                keyframe = null;
                                            }
                                            else {
                                                keyframe = Keyframe.ofInt(g, nmv.h(o5, xmlPullParser, "value", 0, 0));
                                            }
                                        }
                                        else {
                                            keyframe = Keyframe.ofFloat(g, nmv.g(o5, xmlPullParser, "value", 0, 0.0f));
                                        }
                                    }
                                    else if (n7 == 0) {
                                        keyframe = Keyframe.ofFloat(g);
                                    }
                                    else {
                                        keyframe = Keyframe.ofInt(g);
                                    }
                                    final int i = nmv.i(o5, xmlPullParser, "interpolator", 1);
                                    if (i > 0) {
                                        keyframe.setInterpolator((TimeInterpolator)AnimationUtils.loadInterpolator(context, i));
                                    }
                                    o5.recycle();
                                    ArrayList<Keyframe> list4 = list3;
                                    if (keyframe != null) {
                                        if ((list4 = list3) == null) {
                                            list4 = new ArrayList<Keyframe>();
                                        }
                                        list4.add(keyframe);
                                    }
                                    xmlPullParser.next();
                                    list3 = list4;
                                }
                                else {
                                    n6 = n4;
                                }
                                n2 = 3;
                                n4 = n6;
                            }
                            final int n8 = n5;
                            PropertyValuesHolder ofKeyframe = null;
                            Label_1138: {
                                if (list3 != null) {
                                    final int size = list3.size();
                                    if (size > 0) {
                                        final Keyframe keyframe2 = list3.get(0);
                                        final Keyframe keyframe3 = list3.get(size - 1);
                                        final float fraction = keyframe3.getFraction();
                                        int n9 = size;
                                        if (fraction < 1.0f) {
                                            if (fraction < 0.0f) {
                                                keyframe3.setFraction(1.0f);
                                                n9 = size;
                                            }
                                            else {
                                                list3.add(list3.size(), b(keyframe3, 1.0f));
                                                n9 = size + 1;
                                            }
                                        }
                                        final float fraction2 = keyframe2.getFraction();
                                        int n10 = n9;
                                        if (fraction2 != 0.0f) {
                                            if (fraction2 < 0.0f) {
                                                keyframe2.setFraction(0.0f);
                                                n10 = n9;
                                            }
                                            else {
                                                list3.add(0, b(keyframe2, 0.0f));
                                                n10 = n9 + 1;
                                            }
                                        }
                                        final Keyframe[] array2 = new Keyframe[n10];
                                        list3.toArray(array2);
                                        int n11;
                                        for (int k = 0; k < n10; ++k, n10 = n11) {
                                            final Keyframe keyframe4 = array2[k];
                                            n11 = n10;
                                            if (keyframe4.getFraction() < 0.0f) {
                                                if (k == 0) {
                                                    keyframe4.setFraction(0.0f);
                                                    n11 = n10;
                                                }
                                                else {
                                                    final int n12 = n10 - 1;
                                                    if (k == n12) {
                                                        keyframe4.setFraction(1.0f);
                                                        n11 = n10;
                                                    }
                                                    else {
                                                        int n13 = k + 1;
                                                        int n14 = k;
                                                        while (n13 < n12 && array2[n13].getFraction() < 0.0f) {
                                                            n14 = n13;
                                                            ++n13;
                                                        }
                                                        final float n15 = (array2[n14 + 1].getFraction() - array2[k - 1].getFraction()) / (n14 - k + 2);
                                                        int n16 = k;
                                                        while (true) {
                                                            n11 = n10;
                                                            if (n16 > n14) {
                                                                break;
                                                            }
                                                            array2[n16].setFraction(array2[n16 - 1].getFraction() + n15);
                                                            ++n16;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        final PropertyValuesHolder propertyValuesHolder = ofKeyframe = PropertyValuesHolder.ofKeyframe(j, array2);
                                        if (n4 == 3) {
                                            propertyValuesHolder.setEvaluator((TypeEvaluator)bs0.a);
                                            ofKeyframe = propertyValuesHolder;
                                        }
                                        break Label_1138;
                                    }
                                }
                                ofKeyframe = null;
                            }
                            PropertyValuesHolder c;
                            if ((c = ofKeyframe) == null) {
                                c = c(o3, h, 0, 1, j);
                            }
                            list5 = list2;
                            if (c != null) {
                                if ((list5 = list2) == null) {
                                    list5 = new ArrayList();
                                }
                                list5.add(c);
                            }
                            o3.recycle();
                            n2 = 3;
                            depth = n8;
                        }
                        else {
                            list5 = list2;
                        }
                        xmlPullParser.next();
                        list2 = list5;
                    }
                }
                PropertyValuesHolder[] values;
                if (list2 != null) {
                    final int size2 = list2.size();
                    final PropertyValuesHolder[] array3 = new PropertyValuesHolder[size2];
                    int n17 = 0;
                    while (true) {
                        values = array3;
                        if (n17 >= size2) {
                            break;
                        }
                        array3[n17] = (PropertyValuesHolder)list2.get(n17);
                        ++n17;
                    }
                }
                else {
                    values = null;
                }
                if (values != null && o instanceof ValueAnimator) {
                    ((ValueAnimator)o).setValues(values);
                }
                b = true;
                e = o;
            }
            ArrayList list6 = list;
            if (set2 != null) {
                list6 = list;
                if (!b) {
                    if ((list6 = list) == null) {
                        list6 = new ArrayList();
                    }
                    list6.add(e);
                }
            }
            o = e;
            list = list6;
        }
    }
    
    public static Keyframe b(Keyframe keyframe, final float n) {
        if (keyframe.getType() == Float.TYPE) {
            keyframe = Keyframe.ofFloat(n);
        }
        else if (keyframe.getType() == Integer.TYPE) {
            keyframe = Keyframe.ofInt(n);
        }
        else {
            keyframe = Keyframe.ofObject(n);
        }
        return keyframe;
    }
    
    public static PropertyValuesHolder c(final TypedArray typedArray, int n, int n2, final int n3, final String s) {
        final TypedValue peekValue = typedArray.peekValue(n2);
        final boolean b = peekValue != null;
        int type;
        if (b) {
            type = peekValue.type;
        }
        else {
            type = 0;
        }
        final TypedValue peekValue2 = typedArray.peekValue(n3);
        final boolean b2 = peekValue2 != null;
        int type2;
        if (b2) {
            type2 = peekValue2.type;
        }
        else {
            type2 = 0;
        }
        int n4 = n;
        if (n == 4) {
            if ((b && d(type)) || (b2 && d(type2))) {
                n4 = 3;
            }
            else {
                n4 = 0;
            }
        }
        if (n4 == 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        final PropertyValuesHolder propertyValuesHolder = null;
        final PropertyValuesHolder propertyValuesHolder2 = null;
        PropertyValuesHolder propertyValuesHolder3;
        if (n4 == 2) {
            final String string = typedArray.getString(n2);
            final String string2 = typedArray.getString(n3);
            final p0k$a[] c = p0k.c(string);
            final p0k$a[] c2 = p0k.c(string2);
            if (c == null) {
                propertyValuesHolder3 = propertyValuesHolder;
                if (c2 == null) {
                    return propertyValuesHolder3;
                }
            }
            if (c != null) {
                final a a = new a();
                if (c2 != null) {
                    if (!p0k.a(c, c2)) {
                        throw new InflateException(bj.z(" Can't morph from ", string, " to ", string2));
                    }
                    propertyValuesHolder3 = PropertyValuesHolder.ofObject(s, (TypeEvaluator)a, new Object[] { c, c2 });
                }
                else {
                    propertyValuesHolder3 = PropertyValuesHolder.ofObject(s, (TypeEvaluator)a, new Object[] { c });
                }
            }
            else {
                propertyValuesHolder3 = propertyValuesHolder;
                if (c2 != null) {
                    propertyValuesHolder3 = PropertyValuesHolder.ofObject(s, (TypeEvaluator)new a(), new Object[] { c2 });
                }
            }
        }
        else {
            Object a2;
            if (n4 == 3) {
                a2 = bs0.a;
            }
            else {
                a2 = null;
            }
            PropertyValuesHolder propertyValuesHolder5 = null;
            Label_0670: {
                PropertyValuesHolder propertyValuesHolder4;
                if (n != 0) {
                    if (b) {
                        float n5;
                        if (type == 5) {
                            n5 = typedArray.getDimension(n2, 0.0f);
                        }
                        else {
                            n5 = typedArray.getFloat(n2, 0.0f);
                        }
                        if (b2) {
                            float n6;
                            if (type2 == 5) {
                                n6 = typedArray.getDimension(n3, 0.0f);
                            }
                            else {
                                n6 = typedArray.getFloat(n3, 0.0f);
                            }
                            propertyValuesHolder4 = PropertyValuesHolder.ofFloat(s, new float[] { n5, n6 });
                        }
                        else {
                            propertyValuesHolder4 = PropertyValuesHolder.ofFloat(s, new float[] { n5 });
                        }
                    }
                    else {
                        float n7;
                        if (type2 == 5) {
                            n7 = typedArray.getDimension(n3, 0.0f);
                        }
                        else {
                            n7 = typedArray.getFloat(n3, 0.0f);
                        }
                        propertyValuesHolder4 = PropertyValuesHolder.ofFloat(s, new float[] { n7 });
                    }
                }
                else if (b) {
                    if (type == 5) {
                        n = (int)typedArray.getDimension(n2, 0.0f);
                    }
                    else if (d(type)) {
                        n = typedArray.getColor(n2, 0);
                    }
                    else {
                        n = typedArray.getInt(n2, 0);
                    }
                    if (b2) {
                        if (type2 == 5) {
                            n2 = (int)typedArray.getDimension(n3, 0.0f);
                        }
                        else if (d(type2)) {
                            n2 = typedArray.getColor(n3, 0);
                        }
                        else {
                            n2 = typedArray.getInt(n3, 0);
                        }
                        propertyValuesHolder4 = PropertyValuesHolder.ofInt(s, new int[] { n, n2 });
                    }
                    else {
                        propertyValuesHolder4 = PropertyValuesHolder.ofInt(s, new int[] { n });
                    }
                }
                else {
                    propertyValuesHolder5 = propertyValuesHolder2;
                    if (!b2) {
                        break Label_0670;
                    }
                    if (type2 == 5) {
                        n = (int)typedArray.getDimension(n3, 0.0f);
                    }
                    else if (d(type2)) {
                        n = typedArray.getColor(n3, 0);
                    }
                    else {
                        n = typedArray.getInt(n3, 0);
                    }
                    propertyValuesHolder4 = PropertyValuesHolder.ofInt(s, new int[] { n });
                }
                propertyValuesHolder5 = propertyValuesHolder4;
            }
            if ((propertyValuesHolder3 = propertyValuesHolder5) != null) {
                propertyValuesHolder3 = propertyValuesHolder5;
                if (a2 != null) {
                    propertyValuesHolder5.setEvaluator((TypeEvaluator)a2);
                    propertyValuesHolder3 = propertyValuesHolder5;
                }
            }
        }
        return propertyValuesHolder3;
    }
    
    public static boolean d(final int n) {
        return n >= 28 && n <= 31;
    }
    
    public static ValueAnimator e(final Context context, final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final ValueAnimator valueAnimator, final XmlPullParser xmlPullParser) throws Resources$NotFoundException {
        final TypedArray o = nmv.o(resources, resources$Theme, set, b60.g);
        final TypedArray o2 = nmv.o(resources, resources$Theme, set, b60.k);
        ValueAnimator valueAnimator2;
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        }
        else {
            valueAnimator2 = valueAnimator;
        }
        final long duration = nmv.h(o, xmlPullParser, "duration", 1, 300);
        final int n = 0;
        final long startDelay = nmv.h(o, xmlPullParser, "startOffset", 2, 0);
        final int h = nmv.h(o, xmlPullParser, "valueType", 7, 4);
        if (nmv.n(xmlPullParser, "valueFrom") && nmv.n(xmlPullParser, "valueTo")) {
            int n2;
            if ((n2 = h) == 4) {
                final TypedValue peekValue = o.peekValue(5);
                final boolean b = peekValue != null;
                int type;
                if (b) {
                    type = peekValue.type;
                }
                else {
                    type = 0;
                }
                final TypedValue peekValue2 = o.peekValue(6);
                final boolean b2 = peekValue2 != null;
                int type2;
                if (b2) {
                    type2 = peekValue2.type;
                }
                else {
                    type2 = 0;
                }
                if ((b && d(type)) || (b2 && d(type2))) {
                    n2 = 3;
                }
                else {
                    n2 = 0;
                }
            }
            final PropertyValuesHolder c = c(o, n2, 5, 6, "");
            if (c != null) {
                valueAnimator2.setValues(new PropertyValuesHolder[] { c });
            }
        }
        valueAnimator2.setDuration(duration);
        valueAnimator2.setStartDelay(startDelay);
        valueAnimator2.setRepeatCount(nmv.h(o, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator2.setRepeatMode(nmv.h(o, xmlPullParser, "repeatMode", 4, 1));
        if (o2 != null) {
            final ObjectAnimator objectAnimator = (ObjectAnimator)valueAnimator2;
            final String j = nmv.j(o2, xmlPullParser, "pathData", 1);
            if (j != null) {
                final String i = nmv.j(o2, xmlPullParser, "propertyXName", 2);
                final String k = nmv.j(o2, xmlPullParser, "propertyYName", 3);
                if (i == null && k == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(o2.getPositionDescription());
                    sb.append(" propertyXName or propertyYName is needed for PathData");
                    throw new InflateException(sb.toString());
                }
                final Path d = p0k.d(j);
                final PathMeasure pathMeasure = new PathMeasure(d, false);
                final ArrayList<Float> list = new ArrayList<Float>();
                list.add(0.0f);
                float n3 = 0.0f;
                float n4;
                do {
                    n4 = n3 + pathMeasure.getLength();
                    list.add(n4);
                    n3 = n4;
                } while (pathMeasure.nextContour());
                final PathMeasure pathMeasure2 = new PathMeasure(d, false);
                final int min = Math.min(100, (int)(n4 / 0.5f) + 1);
                final float[] array = new float[min];
                final float[] array2 = new float[min];
                final float[] array3 = new float[2];
                final float n5 = n4 / (min - 1);
                int n6 = 0;
                float n7 = 0.0f;
                int n8 = n;
                PropertyValuesHolder ofFloat;
                while (true) {
                    ofFloat = null;
                    if (n8 >= min) {
                        break;
                    }
                    pathMeasure2.getPosTan(n7 - list.get(n6), array3, (float[])null);
                    array[n8] = array3[0];
                    array2[n8] = array3[1];
                    n7 += n5;
                    final int n9 = n6 + 1;
                    int n10 = n6;
                    if (n9 < list.size()) {
                        n10 = n6;
                        if (n7 > list.get(n9)) {
                            pathMeasure2.nextContour();
                            n10 = n9;
                        }
                    }
                    ++n8;
                    n6 = n10;
                }
                PropertyValuesHolder ofFloat2;
                if (i != null) {
                    ofFloat2 = PropertyValuesHolder.ofFloat(i, array);
                }
                else {
                    ofFloat2 = null;
                }
                if (k != null) {
                    ofFloat = PropertyValuesHolder.ofFloat(k, array2);
                }
                if (ofFloat2 == null) {
                    ((ValueAnimator)objectAnimator).setValues(new PropertyValuesHolder[] { ofFloat });
                }
                else if (ofFloat == null) {
                    ((ValueAnimator)objectAnimator).setValues(new PropertyValuesHolder[] { ofFloat2 });
                }
                else {
                    ((ValueAnimator)objectAnimator).setValues(new PropertyValuesHolder[] { ofFloat2, ofFloat });
                }
            }
            else {
                objectAnimator.setPropertyName(nmv.j(o2, xmlPullParser, "propertyName", 0));
            }
        }
        final int l = nmv.i(o, xmlPullParser, "interpolator", 0);
        if (l > 0) {
            valueAnimator2.setInterpolator((TimeInterpolator)AnimationUtils.loadInterpolator(context, l));
        }
        o.recycle();
        if (o2 != null) {
            o2.recycle();
        }
        return valueAnimator2;
    }
    
    public static final class a implements TypeEvaluator<p0k$a[]>
    {
        public p0k$a[] a;
        
        public final Object evaluate(final float n, final Object o, final Object o2) {
            final p0k$a[] array = (p0k$a[])o;
            final p0k$a[] array2 = (p0k$a[])o2;
            if (p0k.a(array, array2)) {
                if (!p0k.a(this.a, array)) {
                    this.a = p0k.e(array);
                }
                for (int i = 0; i < array.length; ++i) {
                    final p0k$a p0k$a = this.a[i];
                    final p0k$a p0k$a2 = array[i];
                    final p0k$a p0k$a3 = array2[i];
                    Objects.requireNonNull(p0k$a);
                    p0k$a.a = p0k$a2.a;
                    int n2 = 0;
                    while (true) {
                        final float[] b = p0k$a2.b;
                        if (n2 >= b.length) {
                            break;
                        }
                        p0k$a.b[n2] = p0k$a3.b[n2] * n + (1.0f - n) * b[n2];
                        ++n2;
                    }
                }
                return this.a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }
}
