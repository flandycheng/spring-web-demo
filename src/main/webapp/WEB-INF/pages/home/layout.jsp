<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/2/5
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="jumbotron">
    <h1>
  李克强：对群众关心问题要及时回应
    </h1>

    <div id="introduce-1">
        <p>{{ message }}</p>
        <a class="btn btn-primary btn-large" href="#">Learn more</a>
        <button class="btn btn-primary btn-large"  v-on:click="reverseMessage">Reverse Message</button>
    </div>
</div>


<script>
    var app5 = new Vue({
        el: '#introduce-1',
        data: {
            message: '“乐民之乐者，民亦乐其乐；忧民之忧者，民亦忧其忧”。困难群众是习近平每逢佳节最牵挂的人。贫困群众之忧，为习近平之忧；为百姓脱贫解忧，是习近平之乐。春风送暖入屠苏，心到、意到、良策到。每年，习近平送出的年货单里都有脱贫致富的良谋佳策，并给当地带来实实在在的改变。'
        },
        methods: {
            reverseMessage: function () {
                this.message = this.message.split('').reverse().join('')
            }
        }
    })
</script>

<div class="row clearfix">
    <div class="col-md-4 column">
        <h2>
            Heading
        </h2>

        <p>
            Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris
            condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod.
            Donec sed odio dui.
        </p>

        <p>
            <a class="btn" href="#">View details »</a>
        </p>
    </div>
    <div class="col-md-4 column">
        <h2>
            Heading
        </h2>

        <p>
            Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris
            condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod.
            Donec sed odio dui.
        </p>

        <p>
            <a class="btn" href="#">View details »</a>
        </p>
    </div>
    <div class="col-md-4 column">
        <h2>
            Heading
        </h2>

        <p>
            Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris
            condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod.
            Donec sed odio dui.
        </p>

        <p>
            <a class="btn" href="#">View details »</a>
        </p>
    </div>
</div>