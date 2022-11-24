// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.richtext;

import com.twitter.model.json.timeline.urt.JsonGraphQlRestId;

public final class a implements x2j<JsonUrtRichText$RichTextEntity, kgs>
{
    public final kgs a(final JsonUrtRichText$RichTextEntity jsonUrtRichText$RichTextEntity) {
        final kgs kgs = null;
        Object o = null;
        Label_0357: {
            Label_0355: {
                if (jsonUrtRichText$RichTextEntity != null) {
                    final JsonUrtRichText$ReferenceObject c = jsonUrtRichText$RichTextEntity.c;
                    if (c != null) {
                        final c9t a = c.a;
                        if (a != null) {
                            o = new yym$a();
                            ((yym$a)o).a = a;
                        }
                        else {
                            final JsonUrtRichText$JsonRichTextUserEntity b = c.b;
                            if (b != null) {
                                o = new czm.a();
                                final JsonGraphQlRestId b2 = b.b;
                                long a2;
                                if (b2 != null) {
                                    a2 = b2.a;
                                }
                                else {
                                    a2 = b.a;
                                }
                                ((czm.a)o).a = a2;
                            }
                            else {
                                final JsonUrtRichText$JsonRichTextMentionEntity c2 = c.c;
                                if (c2 != null) {
                                    o = new oym$a();
                                    ((oym$a)o).a = c2.a;
                                    final JsonGraphQlRestId c3 = c2.c;
                                    long b3;
                                    if (c3 != null) {
                                        b3 = c3.a;
                                    }
                                    else {
                                        b3 = c2.b;
                                    }
                                    ((oym$a)o).b = b3;
                                }
                                else {
                                    final sgc d = c.d;
                                    if (d != null) {
                                        final sgc.a a3 = new sgc.a();
                                        a3.d = d.K0;
                                        a3.b = jsonUrtRichText$RichTextEntity.a;
                                        final int a4 = o5j.a;
                                        a3.c = jsonUrtRichText$RichTextEntity.b;
                                        o = a3;
                                    }
                                    else {
                                        final on3 e = c.e;
                                        if (e != null) {
                                            final on3.a a5 = new on3.a();
                                            a5.d = e.K0;
                                            a5.b = jsonUrtRichText$RichTextEntity.a;
                                            final int a6 = o5j.a;
                                            a5.c = jsonUrtRichText$RichTextEntity.b;
                                            o = a5;
                                        }
                                        else {
                                            final JsonUrtRichText$JsonRichTextTwitterListEntity f = c.f;
                                            if (f == null) {
                                                break Label_0355;
                                            }
                                            o = new wym.a();
                                            ((wym.a)o).a = f.a;
                                            ((wym.a)o).b = f.b;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else {
                        final int d2 = jsonUrtRichText$RichTextEntity.d;
                        if (d2 == -1) {
                            break Label_0355;
                        }
                        o = new kym$a();
                        ((kym$a)o).a = d2;
                    }
                    break Label_0357;
                }
            }
            o = null;
        }
        kgs kgs2;
        if (o == null) {
            kgs2 = kgs;
        }
        else {
            kgs2 = (kgs)((z4j)o).j();
        }
        return kgs2;
    }
    
    public final /* bridge */ Object apply(final Object o) {
        return this.a((JsonUrtRichText$RichTextEntity)o);
    }
}
