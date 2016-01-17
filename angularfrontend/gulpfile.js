/*
* Dependencias
*/
var gulp = require('gulp'),
  concat = require('gulp-concat'),
  uglify = require('gulp-uglify');

/*
* Configuración de la tarea 'minificar'
*/
gulp.task('minificar', function () {
  gulp.src('js/*.js')
  .pipe(concat('todo.js'))
  .pipe(uglify())
  .pipe(gulp.dest('js/build/'))
});
