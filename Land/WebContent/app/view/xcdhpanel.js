/*
 * File: app/view/xcdhpanel.js
 *
 * This file was generated by Sencha Architect version 3.1.0.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 5.0.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 5.0.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('MyApp.view.xcdhpanel', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.xcdhpanel',

    requires: [
        'MyApp.view.xcglpanelViewModel1',
        'Ext.form.Panel',
        'Ext.form.field.ComboBox',
        'Ext.button.Button',
        'Ext.form.FieldSet',
        'Ext.form.field.Checkbox',
        'Ext.form.field.TextArea',
        'Ext.form.field.Spinner',
        'Ext.form.field.Display',
        'Ext.tree.Panel',
        'Ext.tree.View'
    ],

    viewModel: {
        type: 'xcdhpanel'
    },
    border: false,
    frame: true,
    height: 675,
    itemId: 'xcgl',
    width: 300,
    layout: 'accordion',
    bodyBorder: true,
    collapseDirection: 'left',
    collapsible: false,
    title: '巡查导航',
    titleAlign: 'center',
    defaultListenerScope: true,

    items: [
        {
            xtype: 'panel',
            layout: 'fit',
            title: 'GPS设置',
            items: [
                {
                    xtype: 'form',
                    bodyPadding: 10,
                    header: false,
                    title: 'My Form',
                    layout: {
                        type: 'vbox',
                        align: 'center'
                    },
                    items: [
                        {
                            xtype: 'combobox',
                            fieldLabel: '端口设置',
                            labelWidth: 60
                        },
                        {
                            xtype: 'combobox',
                            fieldLabel: '波 特 率',
                            labelWidth: 60
                        },
                        {
                            xtype: 'combobox',
                            fieldLabel: '奇       偶',
                            labelWidth: 60
                        },
                        {
                            xtype: 'combobox',
                            fieldLabel: '数 据 位',
                            labelWidth: 60
                        },
                        {
                            xtype: 'combobox',
                            fieldLabel: '停 止 位',
                            labelWidth: 60
                        },
                        {
                            xtype: 'textfield',
                            fieldLabel: 'X 便宜量',
                            labelWidth: 60
                        },
                        {
                            xtype: 'textfield',
                            fieldLabel: 'Y 便宜量',
                            labelWidth: 60
                        },
                        {
                            xtype: 'container',
                            margin: '10 0 0 0',
                            layout: {
                                type: 'hbox',
                                align: 'middle',
                                pack: 'center'
                            },
                            items: [
                                {
                                    xtype: 'button',
                                    margin: '0 10 0 10',
                                    width: 70,
                                    text: '测试 '
                                },
                                {
                                    xtype: 'button',
                                    margin: '0 10 0 10',
                                    width: 70,
                                    text: '保存'
                                }
                            ]
                        }
                    ]
                }
            ]
        },
        {
            xtype: 'panel',
            title: 'GPS状态',
            layout: {
                type: 'vbox',
                align: 'stretch'
            },
            items: [
                {
                    xtype: 'fieldset',
                    height: 85,
                    margin: '10 10 0 10',
                    title: '位置',
                    layout: {
                        type: 'vbox',
                        align: 'center'
                    },
                    items: [
                        {
                            xtype: 'textfield',
                            fieldLabel: '经度',
                            labelWidth: 30
                        },
                        {
                            xtype: 'textfield',
                            fieldLabel: '纬度',
                            labelWidth: 30
                        }
                    ]
                },
                {
                    xtype: 'fieldset',
                    height: 85,
                    margin: '10 10 0 10',
                    title: '北京时间',
                    layout: {
                        type: 'vbox',
                        align: 'center'
                    },
                    items: [
                        {
                            xtype: 'textfield',
                            fieldLabel: '日期',
                            labelWidth: 30
                        },
                        {
                            xtype: 'textfield',
                            fieldLabel: '时间',
                            labelWidth: 30
                        }
                    ]
                },
                {
                    xtype: 'fieldset',
                    height: 165,
                    margin: '10 10 0 10',
                    layout: 'vbox',
                    title: '其他',
                    items: [
                        {
                            xtype: 'checkboxfield',
                            fieldLabel: 'Label',
                            hideLabel: true,
                            boxLabel: '自动平移'
                        },
                        {
                            xtype: 'textfield',
                            width: 103,
                            fieldLabel: '卫星数目',
                            labelWidth: 60
                        },
                        {
                            xtype: 'textareafield',
                            fieldLabel: '设备状态',
                            labelWidth: 60,
                            emptyText: 'GPS连接不上，硬件找不到'
                        }
                    ]
                }
            ]
        },
        {
            xtype: 'panel',
            title: 'GPS巡查',
            layout: {
                type: 'vbox',
                align: 'stretch'
            },
            items: [
                {
                    xtype: 'fieldset',
                    height: 75,
                    margin: '10 10 0 10',
                    title: 'GPS信号控制',
                    layout: {
                        type: 'hbox',
                        align: 'middle'
                    },
                    items: [
                        {
                            xtype: 'button',
                            flex: 1,
                            margin: '0 10 0 10',
                            text: '开始接收信号'
                        },
                        {
                            xtype: 'button',
                            flex: 1,
                            margin: '0 10 0 10',
                            text: '停止接收信号'
                        }
                    ]
                },
                {
                    xtype: 'fieldset',
                    height: 73,
                    margin: '10 10 0 10',
                    title: '轨迹跟踪',
                    layout: {
                        type: 'hbox',
                        align: 'middle',
                        pack: 'center'
                    },
                    items: [
                        {
                            xtype: 'button',
                            margin: '0 10 0 10',
                            width: 70,
                            text: '开始'
                        },
                        {
                            xtype: 'button',
                            margin: '0 10 0 10',
                            width: 70,
                            text: '停止'
                        },
                        {
                            xtype: 'button',
                            margin: '0 10 0 10',
                            width: 70,
                            text: '目的地'
                        }
                    ]
                },
                {
                    xtype: 'fieldset',
                    height: 73,
                    margin: '10 10 0 10',
                    title: 'GPS单点绘制',
                    layout: {
                        type: 'hbox',
                        align: 'middle',
                        pack: 'center'
                    },
                    items: [
                        {
                            xtype: 'button',
                            margin: '0 10 0 10',
                            width: 70,
                            text: '绘制'
                        },
                        {
                            xtype: 'button',
                            margin: '0 10 0 10',
                            width: 70,
                            text: '完成'
                        },
                        {
                            xtype: 'button',
                            margin: '0 10 0 10',
                            width: 70,
                            text: '取消'
                        }
                    ]
                },
                {
                    xtype: 'fieldset',
                    height: 99,
                    margin: '10 10 0 10',
                    width: 277,
                    title: 'GPS连续绘制',
                    layout: {
                        type: 'vbox',
                        align: 'stretch'
                    },
                    items: [
                        {
                            xtype: 'container',
                            layout: {
                                type: 'hbox',
                                align: 'middle'
                            },
                            items: [
                                {
                                    xtype: 'spinnerfield',
                                    margin: '10 0 10 0',
                                    width: 166,
                                    fieldLabel: '取点时间间隔',
                                    labelWidth: 90
                                },
                                {
                                    xtype: 'displayfield',
                                    margin: '0 0 0 5',
                                    width: 28,
                                    fieldLabel: 'Label',
                                    hideLabel: true,
                                    value: ' 颗'
                                }
                            ]
                        },
                        {
                            xtype: 'container',
                            width: 558,
                            layout: {
                                type: 'hbox',
                                align: 'middle'
                            },
                            items: [
                                {
                                    xtype: 'button',
                                    margin: '0 10 0 0',
                                    width: 70,
                                    text: '绘制'
                                },
                                {
                                    xtype: 'button',
                                    margin: '0 10 0 10',
                                    width: 70,
                                    text: '完成'
                                },
                                {
                                    xtype: 'button',
                                    margin: '0 10 0 10',
                                    width: 70,
                                    text: '取消'
                                }
                            ]
                        }
                    ]
                }
            ]
        },
        {
            xtype: 'panel',
            layout: 'fit',
            title: '行政区定位',
            items: [
                {
                    xtype: 'treepanel',
                    header: false,
                    title: 'My Tree Panel',
                    store: 'xingZhengQuStore',
                    viewConfig: {
                        listeners: {
                            itemdblclick: 'onViewItemDblClick'
                        }
                    }
                }
            ]
        },
        {
            xtype: 'panel',
            title: '图层控制'
        }
    ],

    onViewItemDblClick: function(dataview, record, item, index, e, eOpts) {
        if(index===0){return;}
        alert("行政区编号为："+record.data.dm);
    }

});