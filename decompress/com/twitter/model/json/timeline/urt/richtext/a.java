// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.richtext;

import com.twitter.model.json.timeline.urt.JsonGraphQlRestId;

public final class a implements e2j<JsonUrtRichText$RichTextEntity, xes>
{
    public final xes a(final JsonUrtRichText$RichTextEntity jsonUrtRichText$RichTextEntity) {
        final xes xes = null;
        Object o = null;
        Label_0339: {
            Label_0337: {
                if (jsonUrtRichText$RichTextEntity != null) {
                    final JsonUrtRichText.ReferenceObject c = jsonUrtRichText$RichTextEntity.c;
                    if (c != null) {
                        final q7t a = c.a;
                        if (a != null) {
                            o = new qxm$a();
                            ((qxm$a)o).a = a;
                        }
                        else {
                            final JsonUrtRichText.JsonRichTextUserEntity b = c.b;
                            if (b != null) {
                                o = new uxm$a();
                                final JsonGraphQlRestId b2 = b.b;
                                long a2;
                                if (b2 != null) {
                                    a2 = b2.a;
                                }
                                else {
                                    a2 = b.a;
                                }
                                ((uxm$a)o).a = a2;
                            }
                            else {
                                final JsonUrtRichText.JsonRichTextMentionEntity c2 = c.c;
                                if (c2 != null) {
                                    o = new gxm.a();
                                    ((gxm.a)o).a = c2.a;
                                    final JsonGraphQlRestId c3 = c2.c;
                                    long b3;
                                    if (c3 != null) {
                                        b3 = c3.a;
                                    }
                                    else {
                                        b3 = c2.b;
                                    }
                                    ((gxm.a)o).b = b3;
                                }
                                else {
                                    final qgc d = c.d;
                                    if (d != null) {
                                        final qgc$a qgc$a = new qgc$a();
                                        qgc$a.d = d.H0;
                                        ((d7a.a)qgc$a).b = jsonUrtRichText$RichTextEntity.a;
                                        final int a3 = w4j.a;
                                        ((d7a.a)qgc$a).c = jsonUrtRichText$RichTextEntity.b;
                                        o = qgc$a;
                                    }
                                    else {
                                        final gn3 e = c.e;
                                        if (e != null) {
                                            final gn3$a gn3$a = new gn3$a();
                                            gn3$a.d = e.H0;
                                            ((d7a.a)gn3$a).b = jsonUrtRichText$RichTextEntity.a;
                                            final int a4 = w4j.a;
                                            ((d7a.a)gn3$a).c = jsonUrtRichText$RichTextEntity.b;
                                            o = gn3$a;
                                        }
                                        else {
                                            final JsonUrtRichText.JsonRichTextTwitterListEntity f = c.f;
                                            if (f == null) {
                                                break Label_0337;
                                            }
                                            o = new oxm.a();
                                            ((oxm.a)o).a = f.a;
                                            ((oxm.a)o).b = f.b;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else {
                        final int d2 = jsonUrtRichText$RichTextEntity.d;
                        if (d2 == -1) {
                            break Label_0337;
                        }
                        o = new cxm.a();
                        ((cxm.a)o).a = d2;
                    }
                    break Label_0339;
                }
            }
            o = null;
        }
        xes xes2;
        if (o == null) {
            xes2 = xes;
        }
        else {
            xes2 = (xes)((h4j)o).j();
        }
        return xes2;
    }
}
