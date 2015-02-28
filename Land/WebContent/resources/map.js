dojo.require("dijit.layout.BorderContainer");
dojo.require("dijit.layout.ContentPane");
dojo.require("esri.map");
var map;
function init() {
    map = new esri.Map("mapContainer");
    
          var layer = new esri.layers.ArcGISDynamicMapServiceLayer("http://localhost:6080/arcgis/rest/services/liaoningwork/work/MapServer");
          map.addLayer(layer);
          map.autoResize=true;
    var resizeTimer;
    dojo.connect(map, 'onLoad', function(theMap) {
      dojo.connect(dijit.byId('map'), 'resize', function() {
        clearTimeout(resizeTimer);
        resizeTimer = setTimeout(function() {
          map.resize();
          map.reposition();
         }, 500);
       });
     });
    }
dojo.addOnLoad(init);