App = Ember.Application.create();

App.Router.map(function () {
    this.route("dash", {path: "dash"});
});

App.IndexRoute = Ember.Route.extend({
    model: function () {
        return ['red', 'yellow', 'blue'];
    }
});

App.DashRoute = Ember.Route.extend({
    model: function () {
        return ['Apple', 'Ball', 'Cat', 'Dog'];
    }
});