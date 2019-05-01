function getObject(theObject, k, v) {
    var result = null;
    if(theObject instanceof Array) {
        for(var i = 0; i < theObject.length; i++) {
            result = getObject(theObject[i], k, v);
            if (result) {
                break;
            }   
        }
    }
    else
    {
        for(var prop in theObject) {
            console.log(prop + ': ' + theObject[prop]);
            if(prop == k) {
                if(theObject[prop] == v) {
                    return theObject;
                }
            }
            if(theObject[prop] instanceof Object || theObject[prop] instanceof Array) {
                result = getObject(theObject[prop], k, v);
                if (result) {
                    break;
                }
            } 
        }
    }
    return result;
}

var obj = [
    {
        'title': "some title",
        'channel_id':'123we',
        'options': [
                    {
                'channel_id':'abc',
                'image':'http://asdasd.com/all-inclusive-block-img.jpg',
                'title':'All-Inclusive',
                'options':[
                    {
                        'channel_id':'dsa2',
                        'title':'Some Recommends',
                        'options':[
                            {
                                'image':'http://www.asdasd.com',
								'title':'Sandals',
                                'id':'1'},
							{
                                'image':'http://www.asdasd.com',
								'title':'Shoes',
                                'id':'2'}
								]}]}]}]
var myObj = getObject(obj, 'title', 'Shoes')
console.log('*********************************')								
console.log(myObj)
